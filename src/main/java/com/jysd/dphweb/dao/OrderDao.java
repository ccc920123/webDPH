package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface OrderDao {


List<Order> seleListAction(@Param("loginUser") int loginUser,@Param("page") int page , @Param("size") int size)throws  Exception;
Order selectorderinfo(@Param("loginUser") int loginUser,@Param("orderId") int id )throws  Exception;

OrderGoods selectorderGoods(@Param("orderId") int id )throws  Exception;


Address selectAddress(@Param("id") int id) throws Exception;

List<Cart> selectCart(@Param("loginUser") int loginuser) throws  Exception;

int addOrder(OrderInfo orderInfo)throws Exception;

OrderExpress selectExpress(@Param("orderId")int orderId) throws Exception;



//String selectorderInfoprovincename(@Param("orderInfoprovince")int orderid )throws Exception;
//String orderInfocityname(@Param("orderInfocity")int orderid )throws Exception;
//String selectorderInfodistrictname(@Param("orderInfodistrict")int orderid )throws Exception;


}
