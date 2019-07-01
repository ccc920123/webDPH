package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.Banner;
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

    List<Brand> selectBrand() throws Exception;

    List<Topic> selectTopic() throws Exception;

    List<Category>selectCategory() throws Exception;


    List<GoodsListBean>selectGoodsList(@Param("id") String id)throws Exception;

    ///  api

    int updataBanner(AD banner)throws  Exception;
    int insertBanner(AD banner)throws  Exception;

    int delectBanner(@Param("id") int id)throws  Exception;
    //channel
    int updataChannel(Channel channel)throws  Exception;
    int insertChannel(Channel channel)throws  Exception;

    int delectChannel(@Param("id") int id)throws  Exception;





}
