package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.User;

public interface UserServiceImp {


    Response login(String weixin_openid,User user)throws  Exception;



}
