package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Order;
import com.jysd.dphweb.bean.tablebean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PayDao {


    Order selectOrder(@Param("id") int id)throws  Exception;

    User selectUser(@Param("id") int userid)throws Exception;

}
