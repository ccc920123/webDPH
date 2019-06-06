package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.User;
import com.jysd.dphweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserCtrl {

    @Autowired
    private UserService service;
    @RequestMapping("/auth")
    public Response login(String weixin_openid, User user)
    {


        try {
          return   service.login(weixin_openid,user);
        } catch (Exception e) {
            return null;
        }


    }
}
