package com.jysd.dphweb.bean.tablebean;

import java.util.List;

/**
 * index页面中 categoryList 数据
 */
public class IndexNewCategoryList {

    private  int id;
    private  String name;

    private List<GoodsListBean> goodsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
