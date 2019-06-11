package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;

public interface FootPrintServiceImp {

    Response deleteFootPrint(int loginUserId,int footid)throws Exception;

    Response selectListFootPrint(int loginUserId)throws Exception;


}
