package com.jysd.dphweb.bean.tablebean;

/**
 * 作者:陈渝金
 * 部门：技术部 PDA
 * 创建时间: 2019/4/9 21:46
 * 描述：熱門商品  與最新的商品
 * 修改人：
 * 修改时间：
 */
public class Goods {

    private int id;
    private String name;
    private String listPicUrl;
    private String retailPrice;
    private String goodsBrief;

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

    public String getListPicUrl() {
        return listPicUrl;
    }

    public void setListPicUrl(String listPicUrl) {
        this.listPicUrl = listPicUrl;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief;
    }
}
