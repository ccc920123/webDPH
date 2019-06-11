package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;

public interface CategoryServiceImp {


    Response indexAction(int parentid)throws Exception;
    Response currentAction(int id)throws Exception;


}
