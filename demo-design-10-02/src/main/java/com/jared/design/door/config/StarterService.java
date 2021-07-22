package com.jared.design.door.config;

import org.springframework.util.StringUtils;

/**
 * @author chenjialing
 * @time 2021/7/22 16:02
 */
public class StarterService {
    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }
    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }
}
