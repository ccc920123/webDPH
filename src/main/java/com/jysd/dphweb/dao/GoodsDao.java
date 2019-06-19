package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    List<Goods> selectGoods() throws Exception;

    /**
     * 查询info
     *
     * @param goodsid
     * @return
     * @throws Exception
     */
    GoodsBean selectInfo(@Param("id") int goodsid) throws Exception;

    List<GoodsGallery> selectGallry(@Param("goodid") int goodsid) throws Exception;

    List<AttributeJoinBean> selectAttribute(@Param("goodid") int goodsid) throws Exception;

    List<GoodsIssue> selectGoodsIssues() throws Exception;

    Brand selectBrand(@Param("infogoodid") int infoGoodId) throws Exception;

    CountId selectCountComment(@Param("valueid") int valueid) throws Exception;

    List<Comment> selectHotComment(@Param("valueid") int valueid) throws Exception;

    User selectcommentUser(@Param("userid") int id) throws Exception;

    List<CommentPicture> selectCommentPicture(@Param("commentid") int commentid) throws Exception;

    /**
     * 当前用户是否收藏
     *
     * @param loginId
     * @param valueid
     * @return
     * @throws Exception
     */
    Collect selectIsHasCollect(@Param("loginid") String loginId, @Param("valueid") int valueid) throws Exception;

    /**
     * 记录足迹
     *
     * @param loginId
     * @param valueid
     * @return
     * @throws Exception
     */
    int addFootPrint(@Param("loginid") String loginId, @Param("valueid") int valueid) throws Exception;


    Category selectCategory(@Param("id") int id) throws Exception;

    List<Category> selectBrotherCategory(@Param("parentid") int parent_id) throws Exception;

    List<GoodsBean> listAction(@Param("isnew") int isnew, @Param("ishost") int ishost, @Param("brandid") int brandid, @Param("page") int page, @Param("size") int size) throws Exception;

    int addKeyword(@Param("keyword")String keyWord,@Param("userid")int loginUser)throws  Exception;

    /**
     * 大家都在看
     * @param goodid
     * @return
     * @throws Exception
     */
    List<GoodsBean> relatedAction(@Param("id") int goodid)throws Exception;

    List<GoodsBean> relatedclassAction(@Param("id") int goodid)throws Exception;

    CountId countAction()throws Exception;

}
