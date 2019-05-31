package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Address;
import com.jysd.dphweb.dao.AdderssDao;
import com.jysd.dphweb.service.imp.AddressServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements AddressServiceImp {

    @Autowired
    private AdderssDao dao;

    @Override
    public Response getListAction(String loginUserid) {
        try {
            Address address = dao.selectAllTab(loginUserid);

            String allAction = "";

//         String province_name= dao.selectListAction(address.getProvinceId());


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Response getdetailAction(String loginUserid) {
        return null;
    }

    /**
     * 修改或者保存地址
     *
     * @param loginUserid
     * @param addressbean
     * @return
     */
    @Override
    public Response saveAction(String loginUserid, Address addressbean) {
        try {
            Address address = dao.selectAllTab(loginUserid);

            if ("".equals(address.getId())) {
                //添加数据到数据库
                dao.savaAction(addressbean);
            } else {
                dao.updetaAction(loginUserid, addressbean);
            }

            return new Response().success();

        } catch (Exception e) {
            return new Response().failure();

        }


    }

    /**
     * 删除地址
     *
     * @param loginUserid
     * @return
     */
    @Override
    public Response deleteAction(String loginUserid) {

        try {
            Address address = dao.selectAllTab(loginUserid);

            dao.deleteAction(address.getId(), loginUserid);

            return new Response().success();

        } catch (Exception e) {

            return new Response().failure();
        }


    }
}
