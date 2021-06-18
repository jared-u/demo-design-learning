package com.jared.design.store;

import java.util.Map;

/**
 * @author chenjialing
 * @time 2021/6/18 16:05
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
