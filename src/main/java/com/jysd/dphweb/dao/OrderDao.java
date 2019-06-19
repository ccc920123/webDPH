package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {


List<Order> seleListAction(@Param("loginUser") int loginUser,@Param("page") int page , @Param("size") int size)throws  Exception;



}
