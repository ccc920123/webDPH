package com.jysd.dphweb.bean.tablebean;

/**
 * order 的详情
 */
public class OrderDetailBean {

    private Order orderInfo;
    private OrderGoods orderGoods;
    private String handleOption;


    public Order getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Order orderInfo) {
        this.orderInfo = orderInfo;
    }

    public OrderGoods getOrderGoods() {
        return orderGoods;
    }

    public void setOrderGoods(OrderGoods orderGoods) {
        this.orderGoods = orderGoods;
    }

    public String getHandleOption() {
        return handleOption;
    }

    public void setHandleOption(String handleOption) {
        this.handleOption = handleOption;
    }
}
