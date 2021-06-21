package com.jared.design;

import com.alibaba.fastjson.JSON;
import com.jared.design.mq.CreateAccount;

/**
 * @author chenjialing
 * @time 2021/6/21 11:56
 */
public class CreateAccountMqService {
    public void onMessage(String message) {

        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }
}
