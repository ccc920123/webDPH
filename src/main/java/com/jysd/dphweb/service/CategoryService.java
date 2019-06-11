package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Category;
import com.jysd.dphweb.dao.CategoryDao;
import com.jysd.dphweb.service.imp.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements CategoryServiceImp {

    @Autowired
    CategoryDao dao;

    @Override
    public Response indexAction(int parentid) throws Exception {

        List<Category> categoryList=null;

       categoryList= dao.selectCategoryDate(parentid);


        return new Response().success(categoryList) ;
    }

    @Override
    public Response currentAction(int id) throws Exception {

        List<Category> categoryList=null;

        categoryList=dao.selectCategoryIdDate(id);


        return new Response().success(categoryList);
    }
}
