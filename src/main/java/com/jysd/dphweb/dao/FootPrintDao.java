package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.FootPrint;
import com.jysd.dphweb.bean.tablebean.FootPrintJoinBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FootPrintDao {
    /**
     * 删除足迹
     *
     * @param loginid
     * @param footprintid
     * @return
     */
    int deleteByPrimaryKey(@Param("id") int loginid, @Param("footid") int footprintid) throws Exception;

    /**
     * 查询基础
     *
     * @param loginUser
     * @return
     * @throws Exception
     */
    List<FootPrintJoinBean> selectFoootPrintData(@Param("loginUser") int loginUser) throws Exception;
}