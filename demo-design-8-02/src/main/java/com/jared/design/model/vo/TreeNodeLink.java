package com.jared.design.model.vo;

import lombok.Data;

/**
 * 规则树线信息
 * @author chenjialing
 * @time 2021/6/23 14:08
 */
@Data
public class TreeNodeLink {
    private Long nodeIdFrom;        //节点From
    private Long nodeIdTo;          //节点To
    private Integer ruleLimitType;  //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
    private String ruleLimitValue;  //限定值
}
