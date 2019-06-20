package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.annotations.Param;

public interface OrderServiceImp {

    Response seleListAction(int loginUser, int page ,  int size) throws Exception;

    Response detailAction(int loginUser,int id) throws Exception;

    Response submitAction(int addressid,int userid,int orderid,String postscript)throws  Exception;

}
