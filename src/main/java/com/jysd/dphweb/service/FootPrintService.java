package com.jysd.dphweb.service;

import com.jysd.dphweb.bean.Response;
import com.jysd.dphweb.bean.tablebean.FootPrintJoinBean;
import com.jysd.dphweb.dao.FootPrintDao;
import com.jysd.dphweb.service.imp.FootPrintServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootPrintService implements FootPrintServiceImp {

    @Autowired
    FootPrintDao dao;

    @Override
    public Response deleteFootPrint(int loginUserId, int footid) throws Exception {
        int row = 0;
        row = dao.deleteByPrimaryKey(loginUserId, footid);

        return row > 0 ? new Response().success("删除成功") : new Response().failure("删除失败");
    }

    @Override
    public Response selectListFootPrint(int loginUserId) throws Exception {


        List<FootPrintJoinBean> footPrintJoinBeanList = null;
        footPrintJoinBeanList = dao.selectFoootPrintData(loginUserId);
        return footPrintJoinBeanList.size() > 0 ? new Response().success(footPrintJoinBeanList) : new Response().failure();
    }
}
