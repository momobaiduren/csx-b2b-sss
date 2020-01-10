package com.yh.csx;
/**
 * Launcher class
 * @author yanglikai
 * @since  2019/6/14
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableFeignClients(basePackages = "com.yh.csx")
@EnableDiscoveryClient
@EnableSwagger2
@EnableTransactionManagement
@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
}
