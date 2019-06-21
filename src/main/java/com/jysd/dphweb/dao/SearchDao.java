package com.jysd.dphweb.dao;

import com.jysd.dphweb.bean.tablebean.KeyWords;
import com.jysd.dphweb.bean.tablebean.SearchHistory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SearchDao {

    KeyWords selectdefaultKeyword() throws  Exception;

    List<KeyWords> selecthotKeywordList()throws Exception;

    List<SearchHistory> selecthistoryKeywordList (int userid) throws Exception;



        List<KeyWords>selectKeyWordsHelper(String keyword)throws Exception;

        int clearhistory(int usreid)throws Exception;
}