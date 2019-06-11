package com.jysd.dphweb.bean.tablebean;

/**
 * 评论总数bean
 */
public class CommentCountBean {

    private  int allCount;
    private  int hasPicCount;

    public int getAllCount() {
        return allCount;
    }

    public void setAllCount(int allCount) {
        this.allCount = allCount;
    }

    public int getHasPicCount() {
        return hasPicCount;
    }

    public void setHasPicCount(int hasPicCount) {
        this.hasPicCount = hasPicCount;
    }
}
