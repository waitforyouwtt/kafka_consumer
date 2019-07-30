package com.yidiandian.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 13:57
 * @Email: 15290810931@163.com
 * sheetRecord 记录
 */
@Data
public class SheetRecord {
    //记录头部
    private Header HEADER;
    //item 集合
    private List<ITEM> ITEM;
}
