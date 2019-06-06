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
    Response deleteCartData(String loginUserId, String sessionId, String productId) throws  Exception;

    /**
     *   // 是否选择商品，如果已经选择，则取消选择，批量操作
     * @param loginUserId
     * @param sessionId
     * @param productId
     * @return
     * @throws Exception
     */
    Response checkedCartData(String loginUserId, String sessionId, String productId,boolean isCheck)throws Exception;


    /**
     * 得到商品数量
     * @param loginUserId
     * @param sessionId
     * @return
     * @throws Exception
     */
    Response goodscountCartData(String loginUserId, String sessionId)throws  Exception;

    /**
     * 订单提交前的检验和填写相关订单信息
     * @param loginUserId
     * @param sessionId
     * @return
     * @throws Exception
     */
    Response checkoutAction(String loginUserId, String sessionId,int addressId)throws  Exception;






}



