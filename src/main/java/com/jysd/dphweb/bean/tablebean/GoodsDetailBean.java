package com.jysd.dphweb.bean.tablebean;

import java.util.List;

public class GoodsDetailBean {


    private GoodsBean info;
    private List<GoodsGallery> gallery;

    private List<AttributeJoinBean> attribute;
    private Collect userHasCollect;
    private List<GoodsIssue> issue;
    private CommentGoodsChild comment;
    private Brand brand;

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

    public GoodsBean getInfo() {
        return info;
    }

    public void setInfo(GoodsBean info) {
        this.info = info;
    }

    public List<GoodsGallery> getGallery() {
        return gallery;
    }

    public void setGallery(List<GoodsGallery> gallery) {
        this.gallery = gallery;
    }

    public List<AttributeJoinBean> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<AttributeJoinBean> attribute) {
        this.attribute = attribute;
    }

    public Collect getUserHasCollect() {
        return userHasCollect;
    }

    public void setUserHasCollect(Collect userHasCollect) {
        this.userHasCollect = userHasCollect;
    }

    public List<GoodsIssue> getIssue() {
        return issue;
    }

    public void setIssue(List<GoodsIssue> issue) {
        this.issue = issue;
    }

    public CommentGoodsChild getComment() {
        return comment;
    }

    public void setComment(CommentGoodsChild comment) {
        this.comment = comment;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
