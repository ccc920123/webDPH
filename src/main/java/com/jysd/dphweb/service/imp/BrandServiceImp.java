package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;

public interface BrandServiceImp {

    Response getBrandData(int pageNo,int sizeNo) throws  Exception;

    Response getDetail(int id) throws  Exception;

}
