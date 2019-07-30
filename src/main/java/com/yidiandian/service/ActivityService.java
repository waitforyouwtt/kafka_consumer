package com.yidiandian.service;

import com.yidiandian.dto.OmpActivityVO;
import com.yidiandian.entity.OmpActivity;
import com.yidiandian.entity.SHEET;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 16:28
 * @Email: 15290810931@163.com
 */
public interface ActivityService {
    /**
     * 插入数据库
     * @param ompActivity
     * @return
     */
    void insertActivity(OmpActivity ompActivity);
}
