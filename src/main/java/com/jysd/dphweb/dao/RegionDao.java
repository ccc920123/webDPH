package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Region;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionDao {

    Region  selectRegion(@Param("regionId")int id)throws Exception;
    List<Region> selectListRegion(@Param("parentId") int parentId)throws Exception;


}
