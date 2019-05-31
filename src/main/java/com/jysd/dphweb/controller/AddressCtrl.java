package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressCtrl {

    @Autowired
   private AddressService service;

    /**
     *
     * @param loginUserid 微信得id
     * @return
     */
    @RequestMapping("/listAction")
    public Response getlistAction(String loginUserid)
    {
        try {
            return service.getListAction(loginUserid);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
