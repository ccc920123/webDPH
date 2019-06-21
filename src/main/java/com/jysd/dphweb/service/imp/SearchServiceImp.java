package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;

public interface SearchServiceImp {

  Response indexAction(int userid)throws Exception;
  Response helperAction(String keyword)throws Exception;
  Response clearhistoryAction(int userid)throws Exception;



}
