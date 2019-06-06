package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UseDao {



    /**
     * 注册数据
     *
     * @param record
     * @return
     */
    int insertSelective(User record) throws Exception;

    /**
     * 通过weixin_openid 查询用户是否已经注册 0表示未注册
     *
     * @param weixin_openid
     * @return
     */
    User selectAllUser(@Param("weixin_openid") String weixin_openid) throws Exception;

    /**
     * 跟新用户数据
     *
     * @param userId
     * @return
     * @throws Exception
     */
    int updataLoginData(@Param("id") String userId, @Param("ip") String ip) throws Exception;


}