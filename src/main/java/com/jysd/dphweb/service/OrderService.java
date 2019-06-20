package com.jysd.dphweb.service;

import com.jysd.dphweb.TimeUtils;
import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.*;
import com.jysd.dphweb.dao.OrderDao;
import com.jysd.dphweb.service.imp.OrderServiceImp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderServiceImp {

    OrderDao dao;

    @Override
    public Response seleListAction(int loginUser, int page, int size) throws Exception {


        List<Order> orderList;
        orderList = dao.seleListAction(loginUser, page, size);


        return (orderList != null && orderList.size() > 0) ? new Response().success(orderList) : new Response().failure();
    }

    @Override
    public Response detailAction(int loginUser, int id) throws Exception {


        OrderDetailBean orderDetailBean = new OrderDetailBean();
        Order order;


        order = dao.selectorderinfo(loginUser, id);

        OrderGoods orderGoods;

        orderGoods = dao.selectorderGoods(id);

        orderDetailBean.setOrderInfo(order);
        orderDetailBean.setOrderGoods(orderGoods);

        return orderDetailBean != null ? new Response().success(orderDetailBean) : new Response().failure();
    }

    @Override
    public Response submitAction(int addressid, int userid, int orderid, String postscript) throws Exception {

        Address checkedAddress = dao.selectAddress(addressid);
        if (checkedAddress == null) {
            return new Response().failure("请选择收货地址");
        }
        double freightPrice = 0.00;
        List<Cart> checkedGoodsList = dao.selectCart(userid);

        if (checkedGoodsList == null && checkedGoodsList.size() <= 0) {
            return new Response().failure("请选择商品");
        }
        double goodsTotalPrice = 0.00;

        for (Cart cart : checkedGoodsList) {
            goodsTotalPrice += cart.getNumber() * cart.getRetailPrice();

        }

        //m没有开发优惠卷这块模块
        double couponPrice = 0.00;
        // 订单价格计算
        double orderTotalPrice = goodsTotalPrice + freightPrice - couponPrice; // 订单的总价
        double actualPrice = orderTotalPrice - 0.00; // 减去其它支付的金额后，要实际支付的金额
        int currentTime = TimeUtils.getIntTime();


        Order order = dao.selectorderinfo(userid, orderid);

        //TODO  统计商品总价


        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrder_sn(order.getOrderSn());
        orderInfo.setUser_id(userid);
        orderInfo.setConsignee(checkedAddress.getName());
        orderInfo.setMobile(checkedAddress.getMobile());
        orderInfo.setProvince(checkedAddress.getProvinceId());
        orderInfo.setCity(checkedAddress.getCityId());
        orderInfo.setDistrict(checkedAddress.getDistrictId());
        orderInfo.setAddress(checkedAddress.getAddress());
        orderInfo.setFreight_price(0.00);
        orderInfo.setPostscript(postscript);
        orderInfo.setCoupon_id(0);
        orderInfo.setCoupon_price(couponPrice);
        orderInfo.setAdd_time(currentTime);
        orderInfo.setGoods_price(goodsTotalPrice);
        orderInfo.setOrder_price(orderTotalPrice);
        orderInfo.setActual_price(actualPrice);
        int row = dao.addOrder(orderInfo);

        if (row > 0) {
            return new Response().success();
        } else {
            return new Response().failure("订单提交失败");
        }

//        return null;
    }
}
