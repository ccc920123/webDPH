package com.jysd.dphweb.bean.tablebean;

import java.util.List;

/**
 * 购物车处的地址
 */
public class AddressCart {

    private String checkedAddress;
    private double freightPrice;
    private String checkedCoupon;
    private List<UserCoupon>  couponList;
    private double couponPrice;
    private List<Cart> checkedGoodsList;
    private double goodsTotalPrice;
    private double orderTotalPrice;
    private double actualPrice;

    public String getCheckedAddress() {
        return checkedAddress;
    }

    public void setCheckedAddress(String checkedAddress) {
        this.checkedAddress = checkedAddress;
    }

    public double getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(double freightPrice) {
        this.freightPrice = freightPrice;
    }

    public String getCheckedCoupon() {
        return checkedCoupon;
    }

    public void setCheckedCoupon(String checkedCoupon) {
        this.checkedCoupon = checkedCoupon;
    }

    public List<UserCoupon>  getCouponList() {
        return couponList;
    }

    public void setCouponList(List<UserCoupon> couponList) {
        this.couponList = couponList;
    }

    public double getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(double couponPrice) {
        this.couponPrice = couponPrice;
    }

    public  List<Cart> getCheckedGoodsList() {
        return checkedGoodsList;
    }

    public void setCheckedGoodsList( List<Cart> checkedGoodsList) {
        this.checkedGoodsList = checkedGoodsList;
    }

    public double getGoodsTotalPrice() {
        return goodsTotalPrice;
    }

    public void setGoodsTotalPrice(double goodsTotalPrice) {
        this.goodsTotalPrice = goodsTotalPrice;
    }

    public double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }
}
