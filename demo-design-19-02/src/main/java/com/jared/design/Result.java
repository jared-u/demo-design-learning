package com.jared.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cjl
 * @time 2021/9/10 11:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String code; // 编码
    private String info; // 描述
}
