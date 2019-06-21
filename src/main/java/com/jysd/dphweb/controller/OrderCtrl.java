package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderCtrl {

    @Autowired
    OrderService service;

    @RequestMapping("/listAction")
    public Response listAction(int loginUser, int page, int size) {

        try {
            return service.seleListAction(loginUser, page, size);
        } catch (Exception e) {
            return null;
        }

    }

    @RequestMapping("/detailAction")
    public Response detailAction(int loginUser, int id) {
        try {
            return service.detailAction(loginUser, id);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/submitAction")
    public Response submitAction(int addressid, int userid, int orderid, String postscript) {
        try {

            return service.submitAction(addressid, userid, orderid, postscript);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/expressAction")
    public Response expressAction(int orderId) {
        try {
            return service.expressAction(orderId);
        } catch (Exception e) {
            return null;
        }
    }


}
