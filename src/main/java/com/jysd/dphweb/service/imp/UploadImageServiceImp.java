package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 处理图片的service imp
 */
public interface UploadImageServiceImp {

    Response uploadImageLocahost(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception;
}
