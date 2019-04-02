package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.AD;
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
public interface ADDao {
List<AD> selectAd(String id) throws Exception;
}
