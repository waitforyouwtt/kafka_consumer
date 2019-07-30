package com.yidiandian.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class YhPlatformUpdpriceitem {

    private String phKey;

    private String sheetId;
    //序号
    private Integer seqId;
    //
    private Integer goodsId;
    //供应商编码(不为空时销售后计算供应商折让承担金额)
    private String venDerId;
    //促销折让金额供应商分摊率（0..00～100.00％）
    private BigDecimal alloCateRate;
    //原进价
    private BigDecimal oldCost;
    //促销进价
    private BigDecimal newCost;
    //原售价
    private BigDecimal oldPrice;
    //新售价
    private BigDecimal newPrice;
    //限量标志(1=定量)
    private Integer limitFlag;
    //限量销售量
    private Integer limitQty;
    //促销基金
    private BigDecimal promFund;
    //是否DM促销
    private String dmFlag;
    //促销标识
    private Integer isPromFlag;
    //折扣形式   1、指定成交价；2、指定折扣率；3、指定减金额
    private String prcMode;
    //折扣率
    private BigDecimal disRate;
    //减价金额
    private BigDecimal disAmt;
    //设置方式   1 商品 ，2 组合（品类+品牌）  ，3 供应商
    private String popSetModel;
    //设置品类
    private String catCode;
    //设置品牌
    private String ppCode;
    //设置供应商
    private String supId;
    //取消标识
    private String cancelFlag;
    //参与模式
    private String popJoinModel;

}