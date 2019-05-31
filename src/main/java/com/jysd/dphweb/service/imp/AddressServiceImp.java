package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Address;

public interface AddressServiceImp {



    /**
     *  获取用户的收货地址
     * @param loginUserid
     * @return
     */
    Response getListAction(String loginUserid);

    /**
     * 获取收货地址的详情
     * @param loginUserid
     * @return
     */
    Response getdetailAction(String loginUserid);


    /**
     * 添加或更新收货地址
     * @return
     */
    Response saveAction(String loginUserid,Address addressbean);


    /**
     * 删除指定的收货地址
     * @return
     */
    Response deleteAction(String loginUserid);


}
