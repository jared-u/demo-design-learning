package com.jared.design.service.logic.impl;

import com.jared.design.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author chenjialing
 * @time 2021/6/23 15:22
 */
public class UserGenderFilter  extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
