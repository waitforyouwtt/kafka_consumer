package com.yidiandian.dao;

import com.yidiandian.entity.YhPlatformUpdprice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 16:32
 * @Email: 15290810931@163.com
 */
@Mapper
public interface YhPlatformUpdpriceDao {
   //插入主表数据
   int insertUpdprice(YhPlatformUpdprice updprice);
}
