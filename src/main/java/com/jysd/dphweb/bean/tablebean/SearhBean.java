package com.jysd.dphweb.bean.tablebean;

import java.util.List;

public class SearhBean {
  private  KeyWords  defaultKeyword;
  private List<SearchHistory> historyKeywordList;
  private List<KeyWords>  hotKeywordList;

    public KeyWords getDefaultKeyword() {
        return defaultKeyword;
    }

    public void setDefaultKeyword(KeyWords defaultKeyword) {
        this.defaultKeyword = defaultKeyword;
    }

    public List<SearchHistory> getHistoryKeywordList() {
        return historyKeywordList;
    }

    public void setHistoryKeywordList(List<SearchHistory> historyKeywordList) {
        this.historyKeywordList = historyKeywordList;
    }

    public List<KeyWords> getHotKeywordList() {
        return hotKeywordList;
    }

    public void setHotKeywordList(List<KeyWords> hotKeywordList) {
        this.hotKeywordList = hotKeywordList;
    }
}
