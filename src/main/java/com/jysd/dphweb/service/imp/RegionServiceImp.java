package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;

public interface RegionServiceImp {

    Response selectRegion(int regionId)throws Exception;
    Response selectRegionList(int parentId)throws Exception;
}
