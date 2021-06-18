package com.jared.design.card;

/**
 * 模拟爱奇艺会员卡服务
 * @author chenjialing
 * @time 2021/6/18 15:19
 */
public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
