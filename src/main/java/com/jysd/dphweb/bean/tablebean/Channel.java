package com.jysd.dphweb.bean.tablebean;

/**
 * 作者:陈渝金
 * 部门：技术部 PDA
 * 创建时间: 2019/4/8 23:26
 * 描述：首页banner 下的导航类 ( 获取栏目)
 * 修改人：
 * 修改时间：
 */
public class Channel {

    //
    private int id;
    private String name;
    //跳转的url 也就是小程序的page
    private String url;
    //icon、图片的 url
    private String iconUrl;

    private String sortOrder;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
