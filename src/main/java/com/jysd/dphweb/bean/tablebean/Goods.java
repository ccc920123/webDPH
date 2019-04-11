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
    private String list_pic_url;
    private String retail_price;
    private String goods_brief;

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

    public String getList_pic_url() {
        return list_pic_url;
    }

    public void setList_pic_url(String list_pic_url) {
        this.list_pic_url = list_pic_url;
    }

    public String getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(String retail_price) {
        this.retail_price = retail_price;
    }

    public String getGoods_brief() {
        return goods_brief;
    }

    public void setGoods_brief(String goods_brief) {
        this.goods_brief = goods_brief;
    }
}
