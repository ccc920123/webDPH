package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.AD;
import com.jysd.dphweb.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 作者:陈渝金
 * 公司：四川星盾科技股份有限公司
 * 部门：技术部 PDA
 * 创建时间: 2019/4/1 23:33
 * 描述：  http://47.94.130.23:8080/dphweb/index/index
 * 修改人：
 * 修改时间：
 */
@RestController
@RequestMapping("/index")
public class IndexCtrl {

    @Autowired
    private IndexService service;

    public Response getBanner(String id) {
        try {
            return service.getBanner(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response getChannel() {
        try {


            return service.getChannel();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response getNewGoods(String isnew) {
        try {


            return service.getNewGoods(isnew);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Response getHotGoods(String ishot) {

        try {


            return service.getHotGoods(ishot);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 获取品牌
     *
     * @return is_new 等于1，并且前4条数据
     */
    public Response getBrand() {

        try {
            return service.getBrand();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public Response getTopic() {
        try {

            return service.getTopic();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @RequestMapping("/index")
    public Response getIndextDate() {
        try {

            return service.getIndextDate();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    @RequestMapping("/updataBanner")
    public Response updataBanner(@RequestBody AD banner) {

        try {
            return service.updataBanner(banner);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/insetbanner")
    public Response insertBanner(@RequestBody AD banner) {
        try {
            return service.insertBanner(banner);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/delectbanner")
    public Response delctBanner(@RequestParam int id) {

        try {
            return service.delectBanner(id);
        } catch (Exception e) {
            return null;
        }
    }


}
