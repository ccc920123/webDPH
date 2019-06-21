package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Region;
import com.jysd.dphweb.dao.RegionDao;
import com.jysd.dphweb.service.imp.RegionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService implements RegionServiceImp {
    @Autowired
    RegionDao dao;

    @Override
    public Response selectRegion(int regionId) throws Exception {
        Region region;
        region = dao.selectRegion(regionId);
        return region != null ? new Response().success(region) : new Response().failure();
    }

    @Override
    public Response selectRegionList(int parentId) throws Exception {

        List<Region> regionList;

        regionList = dao.selectListRegion(parentId);


        return regionList.size() > 0 ? new Response().success(regionList) : new Response().failure();
    }
}
