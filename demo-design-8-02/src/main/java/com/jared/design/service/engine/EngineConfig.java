package com.jared.design.service.engine;

import com.jared.design.service.logic.LogicFilter;
import com.jared.design.service.logic.impl.UserAgeFilter;
import com.jared.design.service.logic.impl.UserGenderFilter;
import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenjialing
 * @time 2021/6/23 14:09
 */
@Data
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }
}
