package com.jysd.dphweb.bean.tablebean;


public class Topic {
    private int id;

    private String title;

    private String avatar;

    private String itemPicUrl;

    private String subtitle;

    private int topicCategoryId;

    private double priceInfo;

    private String readCount;

    private String scenePicUrl;

    private int topicTemplateId;

    private int topicTagId;

    private int sortOrder;

    private Boolean isShow;

    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getItemPicUrl() {
        return itemPicUrl;
    }

    public void setItemPicUrl(String itemPicUrl) {
        this.itemPicUrl = itemPicUrl == null ? null : itemPicUrl.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public int getTopicCategoryId() {
        return topicCategoryId;
    }

    public void setTopicCategoryId(int topicCategoryId) {
        this.topicCategoryId = topicCategoryId;
    }

    public double getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(double priceInfo) {
        this.priceInfo = priceInfo;
    }

    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount == null ? null : readCount.trim();
    }

    public String getScenePicUrl() {
        return scenePicUrl;
    }

    public void setScenePicUrl(String scenePicUrl) {
        this.scenePicUrl = scenePicUrl == null ? null : scenePicUrl.trim();
    }

    public int getTopicTemplateId() {
        return topicTemplateId;
    }

    public void setTopicTemplateId(int topicTemplateId) {
        this.topicTemplateId = topicTemplateId;
    }

    public int getTopicTagId() {
        return topicTagId;
    }

    public void setTopicTagId(int topicTagId) {
        this.topicTagId = topicTagId;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}