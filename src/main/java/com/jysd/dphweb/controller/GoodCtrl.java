package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodCtrl {

    @Autowired
    private GoodsService service;

    @RequestMapping("/indexAction")
    public Response indexAction() {

        try {
            return service.selectGoods();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/skuAction")
    public Response skuAction(int id) {
        try {
            return service.skuAction(id);
        } catch (Exception e) {
            return null;
        }


    }

    @RequestMapping("/detailAction")
    public Response detailAction(String loginuserId, int id) {
        try {
            return service.detailAction(loginuserId, id);

        } catch (Exception e) {

            return null;
        }

    }

    @RequestMapping("categoryAction")
    public Response categoryAction(int id) {
        try {
            return service.categoryAction(id);

        } catch (Exception e) {

            return null;
        }
    }

    @RequestMapping("/listAction")
    public Response listAction(int loginUser, String keyword, int isnew, int ishost, int brandid, int page, int size) {
        try {
            return service.listAction(loginUser, keyword, isnew, ishost, brandid, page, size);

        } catch (Exception e) {

            return null;
        }
    }

    @RequestMapping("/relatedAction")
    public Response relatedAction(int id) {
        try {
            return service.relatedAction(id);

        } catch (Exception e) {

            return null;
        }
    }

    @RequestMapping("/countAction")
    public Response countAction() {
        try {
            return service.countAction();

        } catch (Exception e) {

            return null;
        }
    }

}
