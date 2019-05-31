package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdderssDao {
    /**
     * 查询登录进来账号地址表得全部信息
     * @param loginId
     * @return
     * @throws Exception
     */
    Address selectAllTab(@Param("userid") String loginId) throws  Exception;

    /**
     * 根据address 传过来得 值不同来确定地址（province、 city、district）
     * @param provinceid
     * @return
     * @throws Exception
     */
    List<String> selectListAction(@Param("province_id") String provinceid) throws  Exception;


    /**
     * 修改数据
     * @param addressId
     * @param address
     * @return
     * @throws Exception
     */
    int savaAction(@Param("addressbean") Address address) throws  Exception;
    int updetaAction(@Param("addressId")String addressId,@Param("addressbean") Address address) throws  Exception;

    int deleteAction(@Param("addressId")String addressId,@Param("userid") String loginId) throws  Exception;

}
