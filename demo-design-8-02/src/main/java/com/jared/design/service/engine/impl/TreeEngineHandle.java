package com.jared.design.service.engine.impl;

import com.jared.design.model.aggregates.TreeRich;
import com.jared.design.model.vo.EngineResult;
import com.jared.design.model.vo.TreeNode;
import com.jared.design.service.engine.EngineBase;

import java.util.Map;

/**
 * @author chenjialing
 * @time 2021/6/23 14:09
 */
public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
