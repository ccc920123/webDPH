package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Topic;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicDao {

    List<Topic> selectTopic(@Param("page") int page, @Param("size") int size)throws Exception;

    Topic selectdetail(@Param("id")int id)throws Exception;

    List<Topic> selectrelated()throws Exception;


}