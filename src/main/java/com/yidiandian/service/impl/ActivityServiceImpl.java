package com.yidiandian.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.bcel.internal.generic.FADD;
import com.yidiandian.dao.YhPlatformUpdpriceDao;
import com.yidiandian.dao.YhPlatformUpdpriceitemDao;
import com.yidiandian.entity.*;
import com.yidiandian.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 16:31
 * @Email: 15290810931@163.com
 */
@Service
@Slf4j
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    YhPlatformUpdpriceDao updpriceDao;
    @Autowired
    YhPlatformUpdpriceitemDao yhPlatformUpdpriceitemDao;
    /**
     * 插入数据库
     *
     * @param ompActivity
     * @return
     */
    @Override
    public void insertActivity(OmpActivity ompActivity) {
        log.info("接收到的参数：{}",ompActivity);
        List<SheetRecord> sheetList = ompActivity.getSHEET();
        for(SheetRecord sheetRecord : sheetList){
            Header header = sheetRecord.getHEADER();
            log.info("得到的主数据：{}",header);
            YhPlatformUpdprice updprice = new YhPlatformUpdprice();
            //beanCopier 速度和set 一样，语法：source target
            BeanCopier beanCopier = BeanCopier.create(Header.class,YhPlatformUpdprice.class,false);
            beanCopier.copy(header,updprice,null);
            log.info("beanCopier 主数据参数：{}",updprice);
            //插入主数据
            updprice.setSynchro(0);
            updpriceDao.insertUpdprice(updprice);
            //插入从数据
            List<ITEM> items = sheetRecord.getITEM();
            log.info("得到的从数据：{}",items);
            List<YhPlatformUpdpriceitem> updpriceitems = new ArrayList<>();
            for (ITEM item:items){
                YhPlatformUpdpriceitem vo = new YhPlatformUpdpriceitem();
                BeanCopier beanCopier2 = BeanCopier.create(ITEM.class,YhPlatformUpdpriceitem.class, false);
                beanCopier2.copy(item,vo,null);
                updpriceitems.add(vo);
            }
            log.info("得到的从数据参数：{}",updpriceitems);
            yhPlatformUpdpriceitemDao.insertUpdpriceitem(updpriceitems);
        }
    }


}
