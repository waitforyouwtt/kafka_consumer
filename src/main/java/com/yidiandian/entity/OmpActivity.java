package com.yidiandian.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 13:46
 * @Email: 15290810931@163.com
 * OMP 接收到的活动对象
 */
@Data
public class OmpActivity {
    //这是一个SheetRecord
    private List<SheetRecord> SHEET;
}
