package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Comment;
import com.jysd.dphweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentCtrl {
    @Autowired
    CommentService service;

    @RequestMapping("/postAction")
    public Response postAction(Comment comment) {
        try {
            return service.addConnemt(comment);
        } catch (Exception e) {
            return null;
        }

    }

    @RequestMapping("/countAction")
    public Response countAction(int typeid, int valueid) {

        try {
            return service.selectCount(typeid, valueid);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 查询评论
     *
     * @param type    0全部  1  图片
     * @param typeid
     * @param valueid
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/listAction")
    public Response listAction(int type, int typeid, int valueid, int page, int size) {
        try {

            return service.selectComment(type, typeid, valueid, page, size);

        } catch (Exception e) {
            return null;
        }
    }

}
