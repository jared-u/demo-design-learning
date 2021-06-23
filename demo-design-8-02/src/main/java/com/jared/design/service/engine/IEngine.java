package com.jared.design.service.engine;

import com.jared.design.model.aggregates.TreeRich;
import com.jared.design.model.vo.EngineResult;

import java.util.Map;

/**
 * @author chenjialing
 * @time 2021/6/23 14:08
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
