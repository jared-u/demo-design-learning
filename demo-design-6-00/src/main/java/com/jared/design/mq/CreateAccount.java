package com.jared.design.mq;

import lombok.Data;

import java.util.Date;

/**
 * @author chenjialing
 * @time 2021/6/21 11:51
 */
@Data
public class CreateAccount {
    private String number;      // 开户编号
    private String address;     // 开户地
    private Date accountDate;   // 开户时间
    private String desc;        // 开户描述
}
