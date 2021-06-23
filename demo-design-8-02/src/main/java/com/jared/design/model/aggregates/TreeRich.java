package com.jared.design.model.aggregates;

import com.jared.design.model.vo.TreeNode;
import com.jared.design.model.vo.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 *  规则树聚合
 * @author chenjialing
 * @time 2021/6/23 13:29
 */
@Data
@AllArgsConstructor
public class TreeRich {
    private TreeRoot treeRoot;                          //树根信息
    private Map<Long, TreeNode> treeNodeMap;        //树节点ID -> 子节点
}
