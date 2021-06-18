package com.jared.design;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chenjialing
 * @time 2021/6/18 15:32
 */
@Data
@AllArgsConstructor
public class AwardRes {
    private String code; // 编码
    private String info; // 描述
}
