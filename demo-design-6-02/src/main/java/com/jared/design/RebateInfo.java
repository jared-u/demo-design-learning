package com.jared.design;

import lombok.Data;

import java.util.Date;

/**
 * @author chenjialing
 * @time 2021/6/21 12:00
 */
@Data
public class RebateInfo {
    private String userId;  // 用户ID
    private String bizId;   // 业务ID
    private Date bizTime;   // 业务时间
    private String desc;    // 业务描述

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong("1591077840669"));
    }
}
