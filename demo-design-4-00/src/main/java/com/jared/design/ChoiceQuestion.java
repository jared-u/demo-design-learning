package com.jared.design;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 * @author chenjialing
 * @time 2021/6/21 9:33
 */
@Data
@AllArgsConstructor
public class ChoiceQuestion {
    private String name;                 // 题目
    private Map<String, String> option;  // 选项；A、B、C、D
    private String key;                  // 答案；B
}
