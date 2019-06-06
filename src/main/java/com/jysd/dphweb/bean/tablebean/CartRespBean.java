package com.jysd.dphweb.bean.tablebean;

import com.jysd.dphweb.bean.Response;

import java.util.List;

/**
 * 购物车 数据bean
 */
public class CartRespBean   {

    private List<Cart> cartList;


    private CartRespTotalBean cartTotal;

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    public CartRespTotalBean getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(CartRespTotalBean cartTotal) {
        this.cartTotal = cartTotal;
    }
}
