package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Category;
import com.jysd.dphweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryCtrl {
    @Autowired
    CategoryService service;

    @RequestMapping("/indexAction")
    public Response indexAction(int parentid) {
        try {
            return new Response().success(service.indexAction(parentid));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Response().failure();
    }

    @RequestMapping("/currentAction")
    public Response currentAction(int id) {
        try {
            return new Response().success(service.currentAction(id));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Response().failure();
    }

}
