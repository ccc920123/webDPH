package com.jysd.dphweb.bean.tablebean;

/**
 * 获取sku信息，用于购物车编辑时选择规格
 */
public class SkuBean {

    private GoodsBean specificationList;

    private String productList;

    public GoodsBean getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(GoodsBean specificationList) {
        this.specificationList = specificationList;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }
}
