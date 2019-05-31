package com.jysd.dphweb.bean.tablebean;

import java.util.List;

/**
 * index页面中 categoryList 数据
 */
public class IndexNewCategoryList {

    private  String id;
    private  String name;

    private List<GoodsListBean> goodsList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GoodsListBean> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsListBean> goodsList) {
        this.goodsList = goodsList;
    }
}
