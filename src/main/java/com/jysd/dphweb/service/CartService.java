package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.*;
import com.jysd.dphweb.dao.CartDao;
import com.jysd.dphweb.service.imp.CartServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements CartServiceImp {

    @Autowired
    CartDao dao;

    /**
     * 得到购物车得数据
     *
     * @param loginUserId
     * @param sessionId
     * @return
     * @throws Exception
     */
    @Override
    public Response getCartAllData(String loginUserId, String sessionId) throws Exception {

        List<Cart> cartList = null;

        CartRespBean cartRespBean = null;
        // 获取购物车统计信息
        int goodsCount = 0;
        float goodsAmount = (float) 0.00;
        int checkedGoodsCount = 0;
        float checkedGoodsAmount = (float) 0.00;
        try {


            cartList = dao.getAllCart(loginUserId, sessionId);

            for (Cart cartItem : cartList) {
                goodsCount += cartItem.getNumber();
                goodsAmount += cartItem.getNumber() * cartItem.getRetailPrice();
                if (cartItem.getChecked()) {
                    checkedGoodsCount += cartItem.getNumber();
                    checkedGoodsAmount += cartItem.getNumber() * cartItem.getRetailPrice();
                }


            }


            cartRespBean.setCartList(cartList);
            CartRespTotalBean totalBean = new CartRespTotalBean();
            totalBean.setGoodsCount(goodsCount);
            totalBean.setGoodsAmount(goodsAmount);
            totalBean.setCheckedGoodsCount(checkedGoodsCount);
            totalBean.setCheckedGoodsAmount(checkedGoodsAmount);
            cartRespBean.setCartTotal(totalBean);

            return cartRespBean != null ? new Response().success(cartRespBean) : new Response().failure();

        } catch (Exception e) {
            return new Response().failure();
        }


    }

    /**
     * 添加购物车数据
     *
     * @param cart
     * @return
     * @throws Exception
     */
    @Override
    public Response addCartData(String loginUserId, String sessionId, Cart cart) throws Exception {

        List<String> specification = null;
        AllGoods goodsInfo = dao.getIsShop(cart.getGoodsId());

        if (goodsInfo == null || goodsInfo.getIsDelete()) {
            return new Response().failure("商品已经下架");
        }

        Product product = dao.getIsProduct(cart.getGoodsId(), cart.getProductId());

        if (product == null || product.getGoodsNumber() < cart.getNumber()) {
            return new Response().failure("库存不足");
        }
        //判断是否存在购物车里面
        Cart cartInfo = dao.isYesCart(cart.getGoodsId(), cart.getProductId());

        if (cartInfo != null) {
            //   如果已经存在购物车中，则数量增加

            if (product.getGoodsNumber() < (cart.getNumber() + cartInfo.getNumber())) {
                return new Response().failure("库存不足");
            }

            int updatacount = dao.updateNumber(cart.getGoodsId(), cart.getProductId(), cartInfo.getId());
            if (updatacount > 0) {
                return getCartAllData(loginUserId, sessionId);
            }

        } else {
            // 添加操作

            // 添加规格名和值
            if (!"".equals(product.getGoodsSpecificationIds())) {
                specification = dao.getGoodsSpecification(cart.getGoodsId());
            }

            cart.setGoodsSn(product.getGoodsSn());
            cart.setGoodsName(goodsInfo.getName());
            cart.setListPicUrl(goodsInfo.getListPicUrl());
            cart.setSessionId(sessionId);
            cart.setUserId(loginUserId);
            cart.setRetailPrice(product.getRetailPrice());
            cart.setMarketPrice(product.getRetailPrice());
            cart.setGoodsSpecifitionNameValue(specification != null ? String.join(";", specification) : "");
            cart.setGoodsSpecifitionIds(product.getGoodsSpecificationIds());
            cart.setChecked(true);

            int s = dao.insert(cart);
            if (s > 0) {
                return getCartAllData(loginUserId, sessionId);
            }


        }


        return new Response().failure("添加失败");
    }

    /**
     * 更新指定的购物车信息
     *
     * @param loginUserId
     * @param sessionId
     * @param cart
     * @return
     * @throws Exception
     */
    @Override
    public Response updataCartData(String loginUserId, String sessionId, Cart cart) throws Exception {
        List<String> specification = null;
        Product product = dao.getIsProduct(cart.getGoodsId(), cart.getProductId());
        if (product == null || product.getGoodsNumber() < cart.getNumber()) {
            return new Response().failure("库存不足");
        }
// 判断是否已经存在product_id购物车商品
        Cart cartInfo = dao.isCart(cart.getId());
        // 只是更新number
        if (cartInfo.getProductId().equals(cart.getProductId())) {
            int num = dao.updataCartNumber(cart.getId(), cart.getNumber());
            if (num > 0) {
                return new Response().success(dao.getAllCart(loginUserId, sessionId));
            }
        }
        //判断是否存在购物车里面
        Cart newCartInfo = dao.isYesCart(cart.getGoodsId(), cart.getProductId());
        if (newCartInfo != null) {
            // 合并购物车已有的product信息，删除已有的数据
            int newNumber = cart.getNumber() + newCartInfo.getNumber();
            if (product.getGoodsNumber() < (cart.getNumber() + newCartInfo.getNumber())) {
                return new Response().failure("库存不足");
            }
            dao.deleteByPrimaryKey(newCartInfo.getId());
            cart.setNumber(newNumber);
            cart.setGoodsSpecifitionNameValue(newCartInfo.getGoodsSpecifitionNameValue());
            cart.setGoodsSpecifitionIds(newCartInfo.getGoodsSpecifitionIds());
            cart.setRetailPrice(product.getRetailPrice());
            cart.setMarketPrice(product.getRetailPrice());
            cart.setGoodsSn(product.getGoodsSn());
            //跟新数据
            dao.updataCartData(cart);
        } else {
            // 直接更新原来的cartInfo

            // 添加规格名和值
            if (!"".equals(product.getGoodsSpecificationIds())) {
                specification = dao.getGoodsSpecification(cart.getGoodsId());
            }


            cart.setRetailPrice(product.getRetailPrice());
            cart.setMarketPrice(product.getRetailPrice());
            cart.setGoodsSpecifitionNameValue(specification != null ? String.join(";", specification) : "");
            cart.setGoodsSpecifitionIds(product.getGoodsSpecificationIds());
            cart.setGoodsSn(product.getGoodsSn());

            //跟新数据
            dao.updataCartData(cart);


        }
        return new Response().success(dao.getAllCart(loginUserId, sessionId));
    }

    /**
     * 删除选中的购物车商品，批量删除
     *
     * @param productId
     * @return
     * @throws Exception
     */
    @Override
    public Response deleteCartData(String productId) throws Exception {
        return null;
    }


}
