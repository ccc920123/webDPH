package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentServiceImp {

    Response addConnemt(Comment comment)throws Exception;

    Response selectCount(int typeid,  int valueid) throws Exception;

    /**
     * 查询评论
     * @param type 0 全部  1  图片
     * @param typeid
     * @param valueid
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    Response selectComment(int type,int typeid,  int valueid,int page,int size)throws Exception;

}
