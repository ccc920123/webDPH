package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collect")
public class CollectCtrl {

    @Autowired
    CollectService service;

    @RequestMapping("/listAction")
    public Response listAction(String loginUserid, int type) {
        try {


            return service.listAction(loginUserid, type);
        } catch (Exception e) {
            return null;
        }


    }
@RequestMapping("addordeleteAction")
    public Response addordeleteAction(int id, String loginUserid, int typeid, int valueid, int time) {
        try {

            return service.addordeleteAction(id, loginUserid, typeid, valueid, time);

        } catch (Exception e) {
            return null;
        }

    }


}
