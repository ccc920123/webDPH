package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.KeyWords;
import com.jysd.dphweb.bean.tablebean.SearchHistory;
import com.jysd.dphweb.bean.tablebean.SearhBean;
import com.jysd.dphweb.dao.SearchDao;
import com.jysd.dphweb.service.imp.SearchServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService implements SearchServiceImp {
    @Autowired
    SearchDao dao;

    @Override
    public Response indexAction(int userid) throws Exception {

        KeyWords keyWords = dao.selectdefaultKeyword();

        List<KeyWords> keyWordsList = dao.selecthotKeywordList();

        List<SearchHistory> searchHistoryList = dao.selecthistoryKeywordList(userid);

        SearhBean searhBean = new SearhBean();
        searhBean.setDefaultKeyword(keyWords);
        searhBean.setHistoryKeywordList(searchHistoryList);
        searhBean.setHotKeywordList(keyWordsList);

        return new Response().success(searhBean);
    }

    @Override
    public Response helperAction(String keyword) throws Exception {

        List<KeyWords> keyWordsList;
        keyWordsList = dao.selectKeyWordsHelper(keyword);
        return (keyWordsList != null && keyWordsList.size() > 0) ? new Response().success(keyWordsList) : new Response().failure();
    }

    @Override
    public Response clearhistoryAction(int userid) throws Exception {

        int row = dao.clearhistory(userid);

        return row > 0 ? new Response().success() : new Response().failure();
    }
}
