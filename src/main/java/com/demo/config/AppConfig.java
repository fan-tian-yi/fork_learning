package com.demo.config;

/** 应用配置（练习用） */
public class AppConfig {

    public static final String APP_NAME = "fork-learning";

    public static final int MAX_ORDER_ITEMS = 50;

    /** 是否开启会员折扣 */
    public static boolean memberDiscountEnabled() {
        return false;
    }
}
