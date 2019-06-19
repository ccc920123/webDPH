package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.annotations.Param;

public interface GoodsServiceImp {

    Response selectGoods() throws Exception;

    /**
     * 获取sku信息，用于购物车编辑时选择规格
     *
     * @returns {Promise.<Promise|PreventPromise|void>}
     */
    Response skuAction(int id) throws Exception;

    /**
     * 商品详情页数据
     *
     * @param id
     * @return
     * @throws Exception
     */
    Response detailAction(String loginuserId, int id) throws Exception;


    /**
     * 获取分类下的商品
     *
     * @param id
     * @return
     * @throws Exception
     */
    Response categoryAction(int id) throws Exception;


    Response listAction(int loginUser,String keyword,int isnew, int ishost, int brandid,  int page,  int size)throws Exception;

    /**
     * 大家都在看
     * @param id
     * @return
     * @throws Exception
     */
        Response relatedAction(int id)throws Exception;


        Response countAction()throws Exception;

}
