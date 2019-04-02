package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.AD;
import com.jysd.dphweb.dao.ADDao;
import com.jysd.dphweb.service.imp.ADServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者:陈渝金
 * 公司：四川星盾科技股份有限公司
 * 部门：技术部 PDA
 * 创建时间: 2019/4/1 22:22
 * 描述：
 * 修改人：
 * 修改时间：
 */
@Service
public class ADService implements ADServiceImp {

    @Autowired
    private ADDao dao;

    @Override
    public Response getBanner(String id) throws Exception {
        if (id==null && id=="") return new Response().failure("传入类容为空");
        List<AD> bannerList;
        bannerList=dao.selectAd(id);
        return  (bannerList.size()!=0)?  new Response().success(bannerList):new Response().failure("");
    }
}
