package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Cart;
import org.apache.ibatis.annotations.Param;

public interface CartServiceImp {

    Response getCartAllData(String loginUserId,String sessionId)throws Exception;


    Response addCartData(String loginUserId, String sessionId,Cart cart)throws  Exception;


    Response updataCartData(String loginUserId, String sessionId,Cart cart) throws Exception;

    /**
     * 删除选中的购物车商品，批量删除
     * @param productId
     * @return
     * @throws Exception
     */
    Response deleteCartData(@Param("productId") String productId) throws  Exception;

}
