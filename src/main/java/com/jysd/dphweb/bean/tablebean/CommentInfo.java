package com.jysd.dphweb.bean.tablebean;

import java.lang.ref.PhantomReference;
import java.util.List;

public class CommentInfo {

    private String content;
   private long add_time;
   private String nickname;
   private String avatar;
   private List<CommentPicture> pic_list;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getAdd_time() {
        return add_time;
    }

    public void setAdd_time(long add_time) {
        this.add_time = add_time;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<CommentPicture> getPic_list() {
        return pic_list;
    }

    public void setPic_list(List<CommentPicture> pic_list) {
        this.pic_list = pic_list;
    }
}
