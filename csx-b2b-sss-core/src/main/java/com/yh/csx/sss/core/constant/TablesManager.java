package com.yh.csx.sss.core.constant;

/**
 * @author longweier
 * @version 1.0
 * @description 数据库表名管理类
 * @date 2019/5/30 13:45
 */
public final class TablesManager {

    private TablesManager() {

    }

    /**
     * 基础数据
     */
    public static final class Base {
        private Base () {

        }

        //商品储位关系
        public static final String PRODUCT_STORAGE_RELATION = "wms_product_storage_relation";

        //货主
        public static final String SHIPPER = "wms_shipper";

        //储位
        public static final String STORAGE_LOCATION = "wms_storage_location";

        //库区
        public static final String RESERVOIR_AREA = "wms_reservoir_area";

        //货主仓库关系
        public static final String WAREHOUSE_SHIPPER_RELATION = "wms_warehouse_shipper_relation";

        //仓库
        public static final String WAREHOUSE = "wms_warehouse";

        //商品
        public static final String PRODUCTS = "wms_products";

        //配送配置
        public static final String DISTRIBUTION_CONFIG = "wms_distribution_config";

        //单据配置
        public static final String BILLS_CONFIG = "wms_bills_config";
        //快递信息
        public static final String EXPRESS_INFO = "wms_express_info";

        //快递优先级维护
        public static final String EXPRESS_PRIORITY_CHOICE = "wms_express_priority_choice";

        //系统配置
        public static final String SYSTEM_CONFIG = "wms_system_config";

        //商品修改拣选面操作记录
        public static final String PRODUCT_OPERATION_RECORD = "wms_product_operation_record";
        
        //分配规则
        public static final String DISTRSBUTION_RULES = "wms_distrabution_rules";
        //波次规则
        public static final String WAVE_RULES = "wms_wave_rules";
        //门店优先级
        public static final String MERCHANT_PRIORITY_CHOICE = "wms_merchant_priority_choice";
        
    }

    /**
     * 库内作业
     */
    public static final class InnerTask {
        private InnerTask() {

        }

        //商品库存表
        public static final String PRODUCT_STOCK = "wms_product_stock";

        //盘点单明细
        public static final String INVENTORY_PRODUCT_DETAIL = "wms_inventory_product_detail";

        //库存重定位日志表
        public static final String PRODUCT_STOCK_RELOCATION_LOG = "wms_product_stock_relocation_log";

        //盘点过账表
        public static final String INVENTORY_PASS_BILL = "wms_inventory_pass_bill";

        //盘点计划表
        public static final String INVENTORY_PLAN_ORDER = "wms_inventory_plan_order";

        //盘点单头部
        public static final String INVENTORY_ORDER_HEADER = "wms_inventory_order_header";

        //盘点单明细
        public static final String INVENTORY_ORDER_ITEM = "wms_inventory_order_item";

        //库存调整单头部
        public static final String STORE_ADJUSTMENT_ORDER_HEADER = "wms_store_adjustment_order_header";

        //库存调整单明细
        public static final String STORE_ADJUSTMENT_ORDER_ITEM = "wms_store_adjustment_order_item";

        //领用单头部
        public static final String REQUISITIONS_ORDER_HEADER = "wms_requisitions_order_header";

        //领用单明细
        public static final String REQUISITIONS_ORDER_ITEM = "wms_requisitions_order_item";

        //报损单头部
        public static final String FRMLOSS_ORDER_HEADER = "wms_frmloss_order_header";

        //报损单明细
        public static final String FRMLOSS_ORDER_ITEM = "wms_frmloss_order_item";
    }


    //出入库模块
    public static final class InAndOut {

        private InAndOut() {

        }

        //入库单头部信息
        public static final String ENTRY_ORDER_HEADER = "wms_entry_order_header";

        //入库单明细
        public static final String ENTRY_ORDER_ITEM = "wms_entry_order_item";

        //入库单追踪
        public static final String ENTRY_ORDER_TRACE = "wms_entry_order_trace";

        //出库单头部信息
        public static final String SHIPPED_ORDER_HEADER = "wms_shipped_order_header";

        //出库单明细
        public static final String SHIPPED_ORDER_ITEM = "wms_shipped_order_item";

        //出库单追踪
        public static final String SHIPPED_ORDER_TRACE = "wms_shipped_order_trace";
    }
}
