package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Order;
import com.jysd.dphweb.bean.tablebean.PayReturnParamsBean;
import com.jysd.dphweb.bean.tablebean.User;
import com.jysd.dphweb.dao.PayDao;
import com.jysd.dphweb.service.imp.PayServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService implements PayServiceImp {

   @Autowired
    PayDao dao;

    @Override
    public Response prepayAction(int id) throws Exception {
        Order orderInfo = dao.selectOrder(id);

        if (orderInfo == null) {
            return new Response().failure("订单已取消");
        }

        if (orderInfo.getPayStatus()) {
            return new Response().failure("订单已支付，请不要重复操作");
        }

        User user = dao.selectUser(orderInfo.getUserId());

        if (user.getWeixinOpenid() != null && !user.getWeixinOpenid().equals("")) {

            PayReturnParamsBean payReturnParamsBean = new PayReturnParamsBean();
            payReturnParamsBean.setOpenid(user.getWeixinOpenid());
            payReturnParamsBean.setBody("订单编号：" + orderInfo.getOrderSn());
            payReturnParamsBean.setTotal_fee(orderInfo.getActualPrice());
            payReturnParamsBean.setSpbill_create_ip("wx");

            return new Response().success(payReturnParamsBean);

        } else {
            return new Response().failure("微信支付失败");
        }



    }
}
