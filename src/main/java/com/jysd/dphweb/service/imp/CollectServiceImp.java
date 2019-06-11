package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;

public interface CollectServiceImp {

    Response listAction(String loginUserid, int type)throws Exception;

    Response addordeleteAction(int id, String loginUserid, int typeid,int valueid,int time)throws Exception;

}
