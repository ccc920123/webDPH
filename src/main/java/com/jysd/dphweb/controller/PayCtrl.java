package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayCtrl {

    @Autowired
    PayService service;

    @RequestMapping("/prepayAction")
    Response prepayAction(int id) {
        try {

            return service.prepayAction(id);
        } catch (Exception e) {
            return null;
        }

    }

}
