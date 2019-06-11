package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao {
    /**
     * 获取分类栏目数据   输入0
     * @param parentId
     * @return  categoryList
     * @throws Exception
     */
    List<Category> selectCategoryDate(@Param("parentid")int parentId) throws  Exception;

    /**
     * 根据id查询
     * @param id
     * @return
     * @throws Exception
     */
    List<Category> selectCategoryIdDate(@Param("id")int id) throws  Exception;








}