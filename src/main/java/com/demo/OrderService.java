package com.demo;

import java.math.BigDecimal;

/**
 * 订单服务（练习用的假实现，不追求业务完备）。
 *
 * 说明：第 4 章会在这个类的 calcTotal 上故意制造一次合并冲突，
 * 所以这里的代码尽量写得像真实业务代码。
 */
public class OrderService {

    /** 满减门槛 */
    private static final BigDecimal FULL_AMOUNT = new BigDecimal("399");

    /** 满减金额 */
    private static final BigDecimal REDUCE_AMOUNT = new BigDecimal("30");

    /**
     * 计算订单应付金额。
     *
     * @param unitPrice 单价
     * @param quantity  数量
     * @return 应付金额
     */
    public BigDecimal calcTotal(BigDecimal unitPrice, int quantity) {
        if (unitPrice == null || quantity <= 0) {
            throw new IllegalArgumentException("参数不合法");
        }
        BigDecimal total = unitPrice.multiply(BigDecimal.valueOf(quantity));
        // 满减：满 199 减 20
        if (total.compareTo(FULL_AMOUNT) >= 0) {
            total = total.subtract(REDUCE_AMOUNT);
        }
        return total;
    }

    /** 下单（骨架，练习用） */
    public String createOrder(Long userId, BigDecimal unitPrice, int quantity) {
        BigDecimal total = calcTotal(unitPrice, quantity);
        return "order-" + userId + "-" + total.toPlainString();
    }
}
