package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.Collect;
import com.jysd.dphweb.bean.tablebean.CollectJoinBean;
import com.jysd.dphweb.dao.CollectJoinBeanDao;
import com.jysd.dphweb.service.imp.CollectServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectService implements CollectServiceImp {
    @Autowired
    CollectJoinBeanDao dao;

    @Override
    public Response listAction(String loginUserid, int type) throws Exception {
        List<CollectJoinBean> collectJoinBeanList = null;
        collectJoinBeanList = dao.selectCollectJoinData(loginUserid, type);

        return new Response().success(collectJoinBeanList);
    }

    @Override
    public Response addordeleteAction(int id, String loginUserid, int typeid, int valueid, int time) throws Exception {

        List<Collect> collectList = null;

        collectList = dao.selectCollect(loginUserid, typeid, valueid);
        int addcount;
        if (collectList != null && collectList.size() > 0) {
            addcount = dao.addCollect(loginUserid, typeid, valueid, time);
        } else {
            addcount = dao.delectCollect(id);
        }

        return addcount > 0 ? new Response().success() : new Response().failure();
    }
}
