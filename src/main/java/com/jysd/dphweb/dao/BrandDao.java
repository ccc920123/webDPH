package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Brand;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandDao {



    int insertSelective(Brand record);

    /**
     * 分页查询数据
     *
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    List<Brand> selectBrandData(@Param("pageNo") int page, @Param("pageSize") int size) throws Exception;

    /**
     * 通过id来查询商品得详情
     *
     * @param id
     * @return
     * @throws Exception
     */
    Brand detailData(@Param("id") int id) throws Exception;


    int updateByPrimaryKeySelective(Brand record);

}