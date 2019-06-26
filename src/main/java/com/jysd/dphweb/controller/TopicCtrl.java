package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicCtrl {
    @Autowired
    TopicService service;

    @RequestMapping("/listAction")
    public Response selectTopic(@RequestParam int page, @RequestParam int size) {
        try {
            return service.selectTopic(page, size);
        } catch (Exception e) {
            return null;
        }

    }

    @RequestMapping("/detailAction")
    public Response selectdetail(@RequestParam int id) {
        try {
            return service.selectdetail(id);
        } catch (Exception e) {
            return null;
        }

    }

    @RequestMapping("/relatedAction")
    public Response selectrelated() {
        try {
            return service.selectrelated();
        } catch (Exception e) {
            return null;
        }

    }
}
