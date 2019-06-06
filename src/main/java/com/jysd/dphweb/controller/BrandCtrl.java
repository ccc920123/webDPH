package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brand")
public class BrandCtrl {

    @Autowired
    BrandService service;


    @RequestMapping("/brand")
    public Response getBrand(int pageNo, int sizeNo) {
        try {

            return service.getBrandData(pageNo, sizeNo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    /**
     * 查询详情
     *
     * @param id
     * @return
     */
    @RequestMapping("/detail")
    public Response getdetail(int id) {
        try {
            return service.getDetail(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
