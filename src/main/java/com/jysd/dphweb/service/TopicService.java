package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Topic;
import com.jysd.dphweb.dao.TopicDao;
import com.jysd.dphweb.service.imp.TopicServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService implements TopicServiceImp {
    @Autowired
    TopicDao dao;

    @Override
    public Response selectTopic(int page, int size) throws Exception {
        List<Topic> topic;
        topic = dao.selectTopic(page, size);
        return (topic != null && topic.size() > 0) ? new Response().success(topic) : new Response().failure();
    }

    @Override
    public Response selectdetail(int id) throws Exception {


        Topic topic = dao.selectdetail(id);


        return topic != null ? new Response().success(topic) : new Response().failure();
    }

    @Override
    public Response selectrelated() throws Exception {

        List<Topic> topic;

        topic = dao.selectrelated();

        return (topic != null && topic.size() > 0) ? new Response().success(topic) : new Response().failure();
    }

}
