package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者:陈渝金
 * 公司：四川星盾科技股份有限公司
 * 部门：技术部 PDA
 * 创建时间: 2019/4/1 23:33
 * 描述：
 * 修改人：
 * 修改时间：
 */
@RestController
@RequestMapping("index")
public class IndexCtrl {

    @Autowired
    private IndexService service;

    @RequestMapping(value = "/banner", method = RequestMethod.POST)
    public Response getBanner(String id) {
        try {
            return service.getBanner(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "channel", method = RequestMethod.GET)
    public Response getChannel() {
        try {


            return service.getChannel();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "newgoods", method = RequestMethod.POST)
    public Response getNewGoods(String isnew) {
        try {


            return service.getNewGoods(isnew);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "hotgoods", method = RequestMethod.POST)
    public Response getHotGoods(String ishot) {

        try {


            return service.getHotGoods(ishot);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
