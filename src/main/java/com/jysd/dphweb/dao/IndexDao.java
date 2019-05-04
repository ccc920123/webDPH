package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.AD;
import com.jysd.dphweb.bean.tablebean.Brand;
import com.jysd.dphweb.bean.tablebean.Channel;
import com.jysd.dphweb.bean.tablebean.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者:陈渝金
 * 公司：四川星盾科技股份有限公司
 * 部门：技术部 PDA
 * 创建时间: 2019/3/27 23:09
 * 描述：
 * 修改人：
 * 修改时间：
 */
@Repository
public interface IndexDao {
    List<AD> selectAd(@Param("id") String id) throws Exception;

    List<Channel> selectChannel() throws Exception;

    List<Goods> selectNewGoods(@Param("isnew") String isnew) throws Exception;

    List<Goods> selectHotGoods(@Param("ishot") String ishot) throws Exception;

    List<Brand> selectBrand(@Param("isnew") int isnew) throws Exception;


}
