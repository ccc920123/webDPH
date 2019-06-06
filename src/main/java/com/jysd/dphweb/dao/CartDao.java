package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车  模块
 */
@Repository
public interface CartDao {

    /**
     * 查询购物车
     *
     * @param loginUserId
     * @param sessionId
     * @return 返回格式：
     * @throws Exception
     */
    List<Cart> getAllCart(@Param("userid") String loginUserId, @Param("sessionid") String sessionId) throws Exception;

    /**
     * 查询商品是否下架 是否可以购买
     *
     * @param id
     * @return
     * @throws Exception
     */
    AllGoods getIsShop(@Param("id") String id) throws Exception;

    /**
     * 查询库存是否足够
     *
     * @param goodid
     * @param productid
     * @return
     * @throws Exception
     */
    Product getIsProduct(@Param("goodid") String goodid, @Param("productid") String productid) throws Exception;

    /**
     * 查询购物车是否存在该商品
     *
     * @param goodid
     * @param productid
     * @return
     * @throws Exception
     */
    Cart isYesCart(@Param("goodid") String goodid, @Param("productid") String productid) throws Exception;

    /**
     * 通过id来查询购物车是否存在该数据
     *
     * @param id
     * @return
     * @throws Exception
     */
    Cart isCart(@Param("id") int id) throws Exception;


    /**
     * 添加规格名和值
     *
     * @param goodsid
     * @return
     * @throws Exception
     */
    List<String> getGoodsSpecification(@Param("goodsid") String goodsid) throws Exception;


    int insert(Cart record) throws Exception;

    int updateNumber(@Param("goodid") String goodsid, @Param("productId") String productId, @Param("cartInfoid") int cartInfoid) throws Exception;

    int updataCartData(Cart record) throws Exception;

    /**
     * 通过id来更新数据
     *
     * @param id
     * @return
     * @throws Exception
     */
    int updataCartNumber(@Param("id") int id, @Param("number") int number) throws Exception;

    /**
     * 根据id进行删除数据
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(int id) throws Exception;

    /**
     * 根据productId 进行批量删除
     * productId
     *
     * @param productId
     * @return
     */
    int deleteInCartdata(@Param("productId") String productId) throws Exception;


    int checkedCartData(@Param("productId") String productId, @Param("isChecked") boolean isChecked) throws Exception;

    /**
     * 得到购物车物品总条数
     *
     * @return
     * @throws Exception
     */
    int goodscountCartData(@Param("userid") String userid, @Param("sessionid") String sessionid) throws Exception;

//   查询地址

    /**
     * 检查地址
     *
     * @param loginUserId
     * @return
     * @throws Exception
     */
    Address checkedAddress(@Param("loginUserId") String loginUserId, @Param("addressId") int addressId) throws Exception;

    /**
     * 查询省市区
     *
     * @return
     * @throws Exception
     */
    String selectprovincecitydistrict(@Param("parentid") String parentid) throws Exception;

    /**
     * 查询优惠卷
     *
     * @param userid
     * @return
     * @throws Exception
     */
    List<UserCoupon> selectUserCoup(@Param("userid") String userid) throws Exception;


    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);


}