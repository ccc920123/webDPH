package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Cart;
import com.jysd.dphweb.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartCtrl {
    @Autowired
    CartService service;

    /**
     * 获取购物车信息，所有对购物车的增删改操作，都要重新返回购物车的信息
     *
     * @param loginUserId
     * @param sessionId
     * @return
     */
    @RequestMapping("/indexAction")
    public Response indexAction(String loginUserId, String sessionId) {

        try {


            return service.getCartAllData(loginUserId, sessionId);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 添加商品到购物车
     *
     * @param loginUserId
     * @param sessionId
     * @param cart
     * @return
     */
    @RequestMapping("/addAction")
    public Response addAction(String loginUserId, String sessionId, Cart cart) {

        try {


            return service.addCartData(loginUserId, sessionId, cart);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 更新指定的购物车信息
     *
     * @return
     */
    @RequestMapping("/updateAction")
    public Response updateAction(String loginUserId, String sessionId, Cart cart) {

        try {


            return service.updataCartData(loginUserId, sessionId, cart);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 是否选择商品，如果已经选择，则取消选择，批量操作
     *
     * @param loginUserId
     * @param sessionId
     * @param productId
     * @param isCheck
     * @return
     */
    @RequestMapping("/checkedAction")
    public Response checkedAction(String loginUserId, String sessionId, String productId, boolean isCheck) {

        try {


            return service.checkedCartData(loginUserId, sessionId, productId, isCheck);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 删除选中的购物车商品，批量删除
     *
     * @param loginUserId
     * @param sessionId
     * @param productId
     * @return
     */
    @RequestMapping("/deleteAction")
    public Response deleteAction(String loginUserId, String sessionId, String productId) {

        try {


            return service.deleteCartData(loginUserId, sessionId, productId);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 获取购物车商品的总件件数
     *
     * @param loginUserId
     * @param sessionId
     * @return
     */
    @RequestMapping("/goodscountAction")
    public Response goodscountAction(String loginUserId, String sessionId) {

        try {


            return service.goodscountCartData(loginUserId, sessionId);
        } catch (Exception e) {
            return null;
        }

    }

    /**
     * 订单提交前的检验和填写相关订单信息
     * addressId  0
     *
     * @return
     */
    @RequestMapping("/checkoutAction")
    public Response checkoutAction(String loginUserId, String sessionId, int addressId) {

        try {


            return service.checkoutAction(loginUserId, sessionId, addressId);
        } catch (Exception e) {
            return null;
        }

    }

}
