package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    List<Goods> selectGoods()throws Exception;

    /**
     *  查询info
     * @param goodsid
     * @return
     * @throws Exception
     */
    GoodsBean selectInfo(@Param("id") int goodsid) throws Exception;

   List<GoodsGallery> selectGallry(@Param("goodid") int goodsid)throws  Exception;

   List<AttributeJoinBean> selectAttribute(@Param("goodid") int goodsid) throws Exception;
    List<GoodsIssue> selectGoodsIssues()throws Exception;


}
