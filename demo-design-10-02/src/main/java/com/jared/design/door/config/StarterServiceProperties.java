package com.jared.design.door.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author chenjialing
 * @time 2021/7/22 16:02
 */
@ConfigurationProperties("itstack.door")
public class StarterServiceProperties {
    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
