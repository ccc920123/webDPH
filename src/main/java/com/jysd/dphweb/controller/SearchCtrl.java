package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchCtrl {

    @Autowired
    SearchService service;

    @RequestMapping("/indexAction")
    public Response indexAction(int userid) {
        try {

            return service.indexAction(userid);
        } catch (Exception e) {
            return null;
        }

    }

    @RequestMapping("/helperAction")
    public Response helperAction(String keyword) {
        try {
            return service.helperAction(keyword);
        } catch (Exception e) {
            return null;
        }

    }

    @RequestMapping("/clearhistoryAction")
    public Response clearhistoryAction(int userid) {
        try {
            return service.clearhistoryAction(userid);
        } catch (Exception e) {
            return null;
        }

    }
}
