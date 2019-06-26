package com.jysd.dphweb.controller;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.UploadImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 上传图片
 */
@RestController
@RequestMapping("/Upload")
public class UploadImageCtrl {

    @Autowired
    UploadImageService service;

    @RequestMapping("/uploadimage")
    public Response uploadImage(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        try {


            return service.uploadImageLocahost(request, session, response);
        } catch (Exception e) {
            return null;
        }


    }

}
