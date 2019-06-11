package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {

    /**
     * 发表评论
     *
     * @param record content: ('base64') 编码
     * @return
     * @throws Exception
     */
    int insertSelective(Comment record) throws Exception;

    /**
     * 查询评论总条数
     * @param typeid
     * @param valueid
     * @return
     * @throws Exception
     */
    int  selectCount(@Param("typeid") int typeid, @Param("valueid") int valueid)throws  Exception;

    /**
     * 查询图片评论总条数
     * @param typeid
     * @param valueid
     * @return
     * @throws Exception
     */
    int selectPicCount(@Param("typeid") int typeid, @Param("valueid") int valueid)throws Exception;


    /**
     * 分页查询评论(showType 为0时)
     * @param typeid
     * @param valueid
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    List<Comment> selectPagecomment(@Param("typeid") int typeid, @Param("valueid") int valueid,@Param("page") int page,@Param("size") int size) throws  Exception;


    /**
     * 分页查找图片
     * @param typeid
     * @param valueid
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    List<Comment> selectPicComment(@Param("typeid") int typeid, @Param("valueid") int valueid,@Param("page") int page,@Param("size") int size)throws Exception;

}