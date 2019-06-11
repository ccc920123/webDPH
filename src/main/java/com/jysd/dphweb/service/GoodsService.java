package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Goods;
import com.jysd.dphweb.dao.GoodsDao;
import com.jysd.dphweb.service.imp.GoodsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService implements GoodsServiceImp {
    @Autowired
    GoodsDao dao;

    @Override
    public Response selectGoods() throws Exception {
        List<Goods> goodsList=null;
        goodsList= dao.selectGoods();
        return goodsList.size()>0? new Response().success(goodsList):new Response().failure() ;
    }

    @Override
    public Response skuAction(int id) throws Exception {

        dao.selectGoods();




        return null;
    }
}
