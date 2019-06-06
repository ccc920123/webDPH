package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Brand;
import com.jysd.dphweb.dao.BrandDao;
import com.jysd.dphweb.service.imp.BrandServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService implements BrandServiceImp {
    @Autowired
    BrandDao dao;

    @Override
    public Response getBrandData(int pageNo, int sizeNo) throws Exception {
        try {

            List<Brand> brandsList = null;

            brandsList = dao.selectBrandData(pageNo, sizeNo);

            return brandsList.size() > 0 ? new Response().success(brandsList) : new Response().failure("没有商品");
        } catch (Exception e) {

            return new Response().failure("获取商品失败");
        }
    }

    @Override
    public Response getDetail(int id) throws Exception {

        try {

            Brand brand = null;

            brand = dao.detailData(id);
            return brand != null ? new Response().success(brand) : new Response().failure("为查询到商品详情");
        } catch (Exception e) {

            return new Response().failure("查询商品详情异常");

        }


    }
}
