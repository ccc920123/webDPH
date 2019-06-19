package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.*;
import com.jysd.dphweb.dao.GoodsDao;
import com.jysd.dphweb.service.imp.GoodsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService implements GoodsServiceImp {
    @Autowired
    GoodsDao dao;

    @Override
    public Response selectGoods() throws Exception {
        List<Goods> goodsList = null;
        goodsList = dao.selectGoods();
        return goodsList.size() > 0 ? new Response().success(goodsList) : new Response().failure();
    }

    @Override
    public Response skuAction(int id) throws Exception {

        GoodsBean goodsBeanList = dao.selectInfo(id);

        SkuBean skuBean = new SkuBean();
        skuBean.setSpecificationList(goodsBeanList);
        skuBean.setProductList(goodsBeanList.getListPicUrl());


        return new Response().success(skuBean);
    }

    @Override
    public Response detailAction(String loginuserId, int id) throws Exception {

        GoodsBean info = dao.selectInfo(id);

        List<GoodsGallery> goodsGalleryList = dao.selectGallry(id);

        List<AttributeJoinBean> attributeJoinBeanList = dao.selectAttribute(id);

        List<GoodsIssue> goodsIssueList = dao.selectGoodsIssues();

        Brand brand = dao.selectBrand(info.getId());

        CountId commentCount = dao.selectCountComment(id);

        List<Comment> hotComment = dao.selectHotComment(id);

        CommentInfo commentInfo = new CommentInfo();
        if (hotComment != null) {
            User user = dao.selectcommentUser(hotComment.get(0).getUserId());
            commentInfo.setContent(hotComment.get(0).getContent());
            commentInfo.setAdd_time(hotComment.get(0).getAddTime());
            commentInfo.setNickname(user.getNickname());
            commentInfo.setAvatar(user.getAvatar());

            List<CommentPicture> commentPictureList = dao.selectCommentPicture(hotComment.get(0).getId());

            commentInfo.setPic_list(commentPictureList);


        }

        Collect userHasCollect = dao.selectIsHasCollect(loginuserId, id);
        dao.addFootPrint(loginuserId, id);

        CommentGoodsChild comment = new CommentGoodsChild();
        comment.setCount(commentCount.getId());
        comment.setData(commentInfo);

        GoodsBean goodsBeanList = dao.selectInfo(id);


        GoodsDetailBean goodsDetailBean = new GoodsDetailBean();
        goodsDetailBean.setInfo(info);
        goodsDetailBean.setGallery(goodsGalleryList);
        goodsDetailBean.setAttribute(attributeJoinBeanList);
        goodsDetailBean.setUserHasCollect(userHasCollect);
        goodsDetailBean.setIssue(goodsIssueList);
        goodsDetailBean.setComment(comment);
        goodsDetailBean.setBrand(brand);
        goodsDetailBean.setSpecificationList(goodsBeanList);
        goodsDetailBean.setProductList(goodsBeanList.getListPicUrl());

        return new Response().success(goodsDetailBean);
    }

    /**
     * 获取分类下的商品
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Response categoryAction(int id) throws Exception {
        Category currentCategory = dao.selectCategory(id);

        Category parentCategory = dao.selectCategory(currentCategory.getParentId());

        List<Category> brotherCategory = dao.selectBrotherCategory(currentCategory.getParentId());


        categoryActionBean actionBean = new categoryActionBean();
        actionBean.setCurrentCategory(currentCategory);
        actionBean.setParentCategory(parentCategory);
        actionBean.setBrotherCategory(brotherCategory);

        return new Response().success(actionBean);
    }

    /**
     * 搜索商品
     *
     * @param loginUser
     * @param keyword
     * @param isnew
     * @param ishost
     * @param brandid
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @Override
    public Response listAction(int loginUser, String keyword, int isnew, int ishost, int brandid, int page, int size) throws Exception {

        List<GoodsBean> goodsBeanList;

        if (keyword != null && !"".equals(keyword)) {
            dao.addKeyword(keyword, loginUser);
        }

        goodsBeanList = dao.listAction(isnew, ishost, brandid, page, size);


        return new Response().success(goodsBeanList);
    }

    @Override
    public Response relatedAction(int id) throws Exception {

        List<GoodsBean> goodsBeans;
        goodsBeans = dao.relatedAction(id);
        if (goodsBeans != null && goodsBeans.size() > 0) {
            return new Response().success(goodsBeans);
        } else {

            goodsBeans = dao.relatedclassAction(id);
        }


        return new Response().success(goodsBeans);
    }

    /**
     * 查询总个数
     * @return
     * @throws Exception
     */
    @Override
    public Response countAction() throws Exception {


        return new Response().success(dao.countAction());
    }


}
