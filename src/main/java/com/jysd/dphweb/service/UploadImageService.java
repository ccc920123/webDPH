package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.service.imp.UploadImageServiceImp;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.Map;

@Service
public class UploadImageService implements UploadImageServiceImp {

    /**
     * 处理上传的图片并且保存到服务器
     * @param request
     * @param session
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    public Response uploadImageLocahost(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception {

        try {
            MultipartHttpServletRequest rq = (MultipartHttpServletRequest) request;
            Map<String, MultipartFile> file_list = rq.getFileMap();

            if (file_list != null && file_list.size() > 0) {
                if (file_list.containsKey("BANNER")) {
                    MultipartFile file = file_list.get("BANNER");
                    if (file != null) {
                        // 保存订单签收图片
                        String fileName = file.getOriginalFilename();
                        if (fileName!=null&&!fileName.equals(""))
                        {
                            ServletContext servletContext = request.getSession().getServletContext();
                            String uploadPath = servletContext.getRealPath("/") + "upload\\"+"banner\\";
                            File file1=new File(uploadPath);
                            if (!file1.exists())
                            {
                                file1.mkdirs();
                            }
                            File saveFile = new File(uploadPath, fileName);
                            file.transferTo(saveFile);
                        }
                        session.setAttribute("newfilename", fileName);
                    }
                }else if (file_list.containsKey("CHANNEL")) {
                    MultipartFile file = file_list.get("CHANNEL");
                    if (file != null) {
                        // 保存订单签收图片
                        String fileName = file.getOriginalFilename();
                        if (fileName!=null&&!fileName.equals(""))
                        {
                            ServletContext servletContext = request.getSession().getServletContext();
                            String uploadPath = servletContext.getRealPath("/") + "upload\\"+"channel\\";
                            File file1=new File(uploadPath);
                            if (!file1.exists())
                            {
                                file1.mkdirs();
                            }
                            File saveFile = new File(uploadPath, fileName);
                            file.transferTo(saveFile);
                        }
                        session.setAttribute("newfilename", fileName);
                    }
                }else if (file_list.containsKey("inputName")) {
                    MultipartFile file = file_list.get("inputName");
                    if (file != null) {
                        // 保存订单签收图片
                        String fileName = file.getOriginalFilename();
                        if (fileName!=null&&!fileName.equals(""))
                        {
                            ServletContext servletContext = request.getSession().getServletContext();
                            String uploadPath = servletContext.getRealPath("/") + "upload\\";
                            File file1=new File(uploadPath);
                            if (!file1.exists())
                            {
                                file1.mkdirs();
                            }
                            File saveFile = new File(uploadPath, fileName);
                            file.transferTo(saveFile);
                        }
                        session.setAttribute("newfilename", fileName);
                    }
                }
            }
            return new Response().success(session.getAttribute("newfilename"));
        } catch (Exception e) {
            return new Response().failure();
        }

    }
}
