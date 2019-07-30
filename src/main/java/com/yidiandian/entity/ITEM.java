package com.yidiandian.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/27 14:06
 * @Email: 15290810931@163.com
 */
@Data
public class ITEM {

    //促销折让金额供应商分摊率（0..00～100.00％）
    private BigDecimal alloCateRate;
    //取消标识。
    private String cancelFlag;
    //设置品类
    private String catCode;
    //减价金额
    private BigDecimal disAmt;
    //折扣率
    private BigDecimal disRate;
    //是否DM促销
    private String dmFlag;
    //商品ID
    private String goodsId;
    //促销标识
    private Integer isPromFlag;
    //限量标志(1=定量)
    private Integer limitFlag;
    //限量销售量
    private Integer limitQty;
    //促销进价
    private BigDecimal newCost;
    //新售价
    private BigDecimal newPrice;
    //原进价
    private BigDecimal oldCost;
    //原售价
    private BigDecimal oldPrice;
    //主键
    private String phKey;
    //参与模式
    private String popJoinModel;
    //设置方式   1 商品 ，2 组合（品类+品牌）  ，3 供应商
    private String popSetModel;
    //设置品牌
    private String ppCode;
    //折扣形式   1、指定成交价；2、指定折扣率；3、指定减金额
    private String prcMode;
    //促销基金融通:0001日期段促销 0002时段促销 0003限量促销 0004超量促销
    // 融通传输：以下三种促销类型传0值  1001促销商品清单 0012以旧换新 0013低进价入库
    private BigDecimal promFund;
    //序号
    private Integer seqId;
    //单据编号
    private String sheetId;
    //设置供应商
    private String supId;
    //供应商编码(不为空时销售后计算供应商折让承担金额)
    private String venDerId;

    private String saleTaxRate;
    private String costTaxRate;
    private BigDecimal newMPrice1;
    private BigDecimal newMPrice2;
    private BigDecimal newMPrice3;
    private BigDecimal newWPrice;
    private BigDecimal oldMPrice1;
    private BigDecimal oldMPrice2;
    private BigDecimal oldMPrice3;
    private BigDecimal oldWPrice;

}
