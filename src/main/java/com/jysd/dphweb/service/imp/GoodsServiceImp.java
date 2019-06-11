package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;

public interface GoodsServiceImp {

    Response selectGoods()throws  Exception;

    /**
     * 获取sku信息，用于购物车编辑时选择规格
     * @returns {Promise.<Promise|PreventPromise|void>}
     */
    Response skuAction(int id)throws  Exception;


}
