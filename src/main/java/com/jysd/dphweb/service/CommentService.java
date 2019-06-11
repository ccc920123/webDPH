package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Comment;
import com.jysd.dphweb.bean.tablebean.CommentCountBean;
import com.jysd.dphweb.dao.CommentDao;
import com.jysd.dphweb.service.imp.CommentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements CommentServiceImp {

    @Autowired
    CommentDao dao;

    @Override
    public Response addConnemt(Comment comment) throws Exception {

        int row = 0;
        row = dao.insertSelective(comment);
        if (row > 0) {
            return new Response().success("'评论添加成功");
        }
        return new Response().failure("评论保存失败");
    }

    @Override
    public Response selectCount(int typeid, int valueid) throws Exception {
        int allCount = 0;
        int hasPicCount = 0;

        allCount = dao.selectCount(typeid, valueid);
        hasPicCount = dao.selectPicCount(typeid, valueid);

        CommentCountBean commentCountBean = new CommentCountBean();
        commentCountBean.setAllCount(allCount);
        commentCountBean.setHasPicCount(hasPicCount);


        return new Response().success(commentCountBean);
    }

    @Override
    public Response selectComment(int type,int typeid, int valueid, int page, int size) throws Exception {

        List<Comment> commentList=null;

      if (type!=1)
      {
         commentList= dao.selectPagecomment(typeid, valueid, page, size);
      }else {
          commentList=dao.selectPagecomment(typeid, valueid, page, size);
      }

        return new Response().success(commentList);
    }


}
