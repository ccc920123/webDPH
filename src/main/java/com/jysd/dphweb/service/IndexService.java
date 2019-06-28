package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.*;
import com.jysd.dphweb.dao.IndexDao;
import com.jysd.dphweb.service.imp.IndexServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者:陈渝金
 * 公司：四川星盾科技股份有限公司
 * 部门：技术部 PDA
 * 创建时间: 2019/4/1 22:22
 * 描述：
 * 修改人：
 * 修改时间：
 */
@Service
public class IndexService implements IndexServiceImp {

    @Autowired
    private IndexDao dao;

    @Override
    public Response getBanner(String id) throws Exception {
        if (id == null && id == "") return new Response().failure("传入类容为空");
        List<AD> bannerList;
        bannerList = dao.selectAd(id);
        return (bannerList.size() != 0) ? new Response().success(bannerList) : new Response().failure("");
    }

    @Override
    public Response getChannel() throws Exception {
        List<Channel> channelList;

        channelList = dao.selectChannel();
        return (channelList.size() != 0) ? new Response().success(channelList) : new Response().failure("");
    }

    @Override
    public Response getNewGoods(String is_new) throws Exception {
        List<Goods> goodsNewList;

        goodsNewList = dao.selectNewGoods(is_new);

        return (goodsNewList.size() != 0) ? new Response().success(goodsNewList) : new Response().failure("");
    }

    @Override
    public Response getHotGoods(String is_hot) throws Exception {

        List<Goods> goodsHotList;

        goodsHotList = dao.selectHotGoods(is_hot);

        return (goodsHotList.size() != 0) ? new Response().success(goodsHotList) : new Response().failure("");
    }

    @Override
    public Response getBrand() throws Exception {

        List<Brand> brandList = null;
//
        brandList = dao.selectBrand();

        return (brandList.size() != 0) ? new Response().success(brandList) : new Response().failure("");
    }

    @Override
    public Response getTopic() throws Exception {


        List<Topic> toPicList = null;

        toPicList = dao.selectTopic();

        return (toPicList.size() != 0) ? new Response().success(toPicList) : new Response().failure("");

    }

    @Override
    public Response getCategory() throws Exception {

        List<Category> categoryList = null;

        categoryList = dao.selectCategory();
        return (categoryList.size() != 0) ? new Response().success(categoryList) : new Response().failure("");
    }

    @Override
    public Response getIndextDate() throws Exception {
        //类别
       List<AD> banners= dao.selectAd("1");
        IndexDataBean indexDataList = null;
        indexDataList = new IndexDataBean();

        indexDataList.setBanner(banners);
       List<Channel> channelList= dao.selectChannel();
        indexDataList.setChannel(channelList);
       List<Goods> newgoodsList= dao.selectNewGoods("1");
        indexDataList.setNewGoodsList(newgoodsList);
        List<Goods> hotgoodsList=dao.selectHotGoods("1");
        indexDataList.setHotGoods(hotgoodsList);
        List<Brand> brandList=dao.selectBrand();
        indexDataList.setBrandList(brandList);
        List<Topic> topicList =dao.selectTopic();
        indexDataList.setTopicList(topicList);
        List<Category> categoryList = null;
        categoryList = dao.selectCategory();
        if (categoryList.size() != 0) {
            List<IndexNewCategoryList> date = new ArrayList<>();
            for (Category categoryItem : categoryList) {
                IndexNewCategoryList newCategoryListlist = new IndexNewCategoryList();
                newCategoryListlist.setId(categoryItem.getId());
                newCategoryListlist.setName(categoryItem.getName());
                newCategoryListlist.setGoodsList(dao.selectGoodsList(categoryItem.getId()+""));
                date.add(newCategoryListlist);


            }



            indexDataList.setCategoryList(date);

            return new Response().success(indexDataList);
        } else {

            return new Response().failure("");

        }


    }

    @Override
    public Response updataBanner(AD banner) throws Exception {

        int row=dao.updataBanner( banner);


        return row>0?new Response().success():new Response().failure();
    }

    @Override
    public Response insertBanner(AD banner) throws Exception {
        int row=dao.insertBanner(banner);
        return row>0 ? new Response().success():new Response().failure();
    }

    @Override
    public Response delectBanner(int id) throws Exception {

       int row= dao.delectBanner(id);
        return row>0?new Response().success():new Response().failure();
    }
}
