package com.jared.design;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chenjialing
 * @time 2021/6/21 9:32
 */
@Data
@AllArgsConstructor
public class AnswerQuestion {
    private String name;  // 问题
    private String key;   // 答案
}
