package com.jysd.dphweb.bean.tablebean;

import java.util.List;

public class IndexDataBean {
    private List<AD> banner;
    private List<Channel> channel;
    private List<Goods> newGoodsList;
    private List<Goods> hotGoods;
    private List<Brand> brandList;
    private List<Topic> topicList;
    private List<IndexNewCategoryList> categoryList;

    public List<AD> getBanner() {
        return banner;
    }

    public void setBanner(List<AD> banner) {
        this.banner = banner;
    }

    public List<Channel> getChannel() {
        return channel;
    }

    public void setChannel(List<Channel> channel) {
        this.channel = channel;
    }

    public List<Goods> getNewGoodsList() {
        return newGoodsList;
    }

    public void setNewGoodsList(List<Goods> newGoodsList) {
        this.newGoodsList = newGoodsList;
    }

    public List<Goods> getHotGoods() {
        return hotGoods;
    }

    public void setHotGoods(List<Goods> hotGoods) {
        this.hotGoods = hotGoods;
    }

    public List<Brand> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<Brand> brandList) {
        this.brandList = brandList;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public List<IndexNewCategoryList> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<IndexNewCategoryList> categoryList) {
        this.categoryList = categoryList;
    }
}
