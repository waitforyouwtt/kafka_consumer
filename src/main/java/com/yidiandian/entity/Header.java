package com.yidiandian.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 14:04
 * @Email: 15290810931@163.com
 */
@Data
public class Header {

    //区域信息
    private String areaId;
    //调价模式：0永久调价，1促销调价
    private String changeMode;
    //审核日期
    private String checkDate;
    //会员类型
    private String custType;
    //DM促销单号
    private String dmSheetId;
    //结束日期
    private Date endDate;
    //结束时间
    private String endTime;
    //执行时间
    private Date executeTime;
    //促销扣款分担方式1-进价差2-售价差
    private Integer fdMode;
    //是否允许为空
    private String isEmpty;
    //调售价标志 0不调正常售价;1调正常售价（包括促销售价、促销包装售价）
    private String nmPriceFlag;
    //备注
    private String note;
    //调价优先级别
    private String orderFlag;
    //主键
    private String phKey;
    //档期编号
    private String planId;
    //促销级别   0：单品、1：组别、2：组站
    private String popLevel;
    //促销号
    private String promNo;
    //调价单号
    private String refSheetId;
    //取消单类型
    private String refSheetType;
    //所有单据不重复  按照这个单处理优先级
    private String ruleNo;
    //时段标志(1-全天2-时段)
    private String sdFlag;
    //取消标志  （Y正常  ，N  取消）
    private String sheetCancelFlag;
    //单据编号
    private String sheetId;
    //调价店号
    private String shopId;
    //开始日期
    private Date startDate;
    //开始时间
    private String startTime;
    //调价类型：001 DM调价002 竞争调价003 市调调价 004 出清调价
    // 融通传输：以下两种促销类型不传，传空值：1001 促销商品清单 0013低进价入库
    // 融通传输：以下五种促销类型需传：0001日期段促销  0002时段促销  0003限量促销  0004超量促销  0012以旧换新
    private String updType;

    private String mbPriceFlag;
    private String flag;
    private String   editDate;
    private String editor;
    private String checker;
    private String categoryId;
    private String wsPriceFlag;
    private String operator;
    private String pri;
    private String printCount;

}
