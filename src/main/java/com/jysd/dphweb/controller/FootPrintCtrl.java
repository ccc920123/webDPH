package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.FootPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/footprint")
public class FootPrintCtrl {
    @Autowired
    FootPrintService service;

    @RequestMapping("/deleteAction")
    public Response deleteAction(int loginUserId, int footid) {

        try {
            return service.deleteFootPrint(loginUserId, footid);

        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/listAction")
    public Response listAction(int loginUserId) {
        try {
            return service.selectListFootPrint(loginUserId);
        } catch (Exception e) {
            return null;
        }
    }
}
