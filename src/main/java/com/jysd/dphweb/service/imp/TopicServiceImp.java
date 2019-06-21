package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Topic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopicServiceImp {

    Response selectTopic(int page, int size)throws Exception;

    Response selectdetail(int id)throws Exception;

    Response selectrelated()throws Exception;
}
