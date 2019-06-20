package com.jysd.dphweb;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    public static int  getIntTime()
    {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");//可以方便地修改日期格式
        String hehe = dateFormat.format( now );
       return  Integer.parseInt(hehe);
    }
}
