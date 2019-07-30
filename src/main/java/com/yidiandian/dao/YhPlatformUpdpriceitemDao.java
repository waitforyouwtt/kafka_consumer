package com.yidiandian.dao;

import com.yidiandian.entity.YhPlatformUpdpriceitem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 16:43
 * @Email: 15290810931@163.com
 */
@Mapper
public interface YhPlatformUpdpriceitemDao {
    /**
     * 插入数据库
     * @param list
     * @return
     */
    int insertUpdpriceitem(@Param("list") List<YhPlatformUpdpriceitem> list);
}
