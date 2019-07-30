package com.yidiandian.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/26 15:07
 * @Email: 15290810931@163.com
 */
@Data
public class Message {
    //id
    private Long id;
    //消息
    private String msg;
    //时间戳
    private Date sendTime;
}
