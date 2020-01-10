package com.yh.csx.sss.core.worker;

import com.yh.csx.bsf.core.thread.ThreadPool;
import com.yh.csx.sss.core.utils.ResolutionUtils;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.util.Pair;

/**
 * @author  zhanglong
 * @since  2019/11/17  11:09 上午
 * 业务工作队列 本身线程不安全；单线程操作，
 * 不能用于多线程嵌套使用 在使用多线程时要考虑线程开销和正常业务开销的相对性，
 * 管理线程的开销比业务开销大，就不建议使用多线程
 */
public final class WorkTaskQueue {

    /**
     * description 最大等待时间ms
     */
    private long maxWait;
    /**
     * description 线程使用监控，监控工作窃取,防止线程溢出最大线程数
     */
    private AtomicInteger runningFlag = new AtomicInteger(0);
    /**
     * description 线程队列, ConcurrentLinkedQueue 非阻塞无边界队列，线程安全的，执行效率比较高
     */
    private Queue<Runnable> workTaskQueue = new ConcurrentLinkedQueue<>();

    /**
     * description 每个任务超时时间默认值为无限时常
     */
    public WorkTaskQueue() {
        this.maxWait = Long.MAX_VALUE;
    }

    /**
     * create by ZhangLong on 2019/11/30
     *
     * @param maxWait 小于等于0执行任务没有超时,轮训处理
     */
    public WorkTaskQueue( long maxWait ) {
        if (maxWait <= 0) {
            this.maxWait = Long.MAX_VALUE;
        } else {
            this.maxWait = maxWait;
        }
    }

    /**
     * description 注册任务 线程安全同步
     */
    public void register( Runnable task ) {
        Objects.requireNonNull(task, "task could not be null");
        workTaskQueue.offer(task);
    }


    /**
     * create by ZhangLong on 2019/12/1 description 提交任务
     */
    public void submit() {
        final ThreadPool threadPool = ThreadPool.System;
        Queue<Pair<Future, Long>> workingTaskQueue = new ConcurrentLinkedQueue<>();
        try {
            executionTask(threadPool, workingTaskQueue);
            threadPool.shutdown();
        } finally {
            ResolutionUtils.releaseSource(workTaskQueue, workingTaskQueue);
        }
    }

    /**
     * description 执行任务
     */
    private void executionTask(ThreadPool threadPool,
        Queue<Pair<Future, Long>> workingTaskQueue ) {
        while (workTaskQueue.size() > 0) {
            if (runningFlag.get() < threadPool.getThreadPool().getMaximumPoolSize()) {
                final Future future = threadPool.submit("SSS_DEFAULT_TASK", workTaskQueue.poll());
                runningFlag.incrementAndGet();
                if (future.isCancelled()) {
                    runningFlag.decrementAndGet();
                    continue;
                }
                workingTaskQueue.offer(new Pair<>(future, System.currentTimeMillis()));
            }
            //监控线程执行任务
            monitorTask(workingTaskQueue);
        }

    }

    private void monitorTask( Queue<Pair<Future, Long>> workingTaskQueue ) {
        Pair<Future, Long> futureTaskLongPair;
        if (Objects.nonNull(futureTaskLongPair = workingTaskQueue.poll())) {
            if (System.currentTimeMillis() - futureTaskLongPair.getValue() > maxWait) {
                //超时处理
                futureTaskLongPair.getKey().cancel(true);
                System.err.println("线程执行超时,已取消");
                runningFlag.decrementAndGet();
                return;
            }
            //调用isDone阻塞线程
            if (Objects.requireNonNull(futureTaskLongPair.getKey()).isDone()) {
                runningFlag.decrementAndGet();
            } else {
                workingTaskQueue.offer(futureTaskLongPair);
            }
        }
    }

}
