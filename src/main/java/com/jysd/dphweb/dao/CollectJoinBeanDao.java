package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Collect;
import com.jysd.dphweb.bean.tablebean.CollectJoinBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectJoinBeanDao {

    List<CollectJoinBean> selectCollectJoinData(@Param("loginUserid") String loginUserid, @Param("type")int type)throws  Exception;
    List<Collect> selectCollect(@Param("loginUserid") String loginUserid, @Param("typeid")int typeid,@Param("valueid")int valueid)throws Exception;

    int addCollect(@Param("loginUserid") String loginUserid, @Param("typeid")int typeid,@Param("valueid")int valueid,@Param("time") int time)throws Exception;

    int delectCollect(@Param("id") int id)throws  Exception;

}
