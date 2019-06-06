package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.User;
import com.jysd.dphweb.dao.UseDao;
import com.jysd.dphweb.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceImp {

    @Autowired
    private UseDao dao;

    @Override
    public Response login(String weixin_openid, User user) throws Exception {
        User userInfo=null;
        userInfo = dao.selectAllUser(weixin_openid);

        if (userInfo==null ||"".equals(userInfo.getId())) {
            dao.insertSelective(user);
        } else {

            int count = dao.updataLoginData(userInfo.getId(), user.getLastLoginIp());

            if (count != 0) {
                userInfo = dao.selectAllUser(weixin_openid);
            }else{
                userInfo=null;
            }

        }


        return userInfo!=null?new Response().success(userInfo):new Response().failure();
    }
}
