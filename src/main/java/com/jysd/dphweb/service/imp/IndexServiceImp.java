package com.jysd.dphweb.service.imp;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.AD;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.ibatis.annotations.Param;

/**
 * 作者:陈渝金
 * 公司：四川星盾科技股份有限公司
 * 部门：技术部 PDA
 * 创建时间: 2019/4/1 23:20
 * 描述：
 * 修改人：
 * 修改时间：
 */
public interface IndexServiceImp {
    //获取小程序首页的Banner 广告
    Response getBanner(String id) throws Exception;

    //获取栏目
    Response getChannel() throws Exception;

    //得到前4的新商品
    Response getNewGoods(String is_new) throws Exception;

    //得到前3的热门商品
    Response getHotGoods(String is_hot) throws Exception;

    //
    Response getBrand() throws Exception;
    Response getTopic() throws Exception;

    Response getCategory() throws  Exception;

    Response getIndextDate() throws  Exception;


    Response updataBanner(int id)throws  Exception;
    Response insertBanner(AD banner)throws  Exception;
}
