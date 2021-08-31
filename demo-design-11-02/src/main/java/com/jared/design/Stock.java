package com.jared.design;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author cjl
 * @time 2021/8/31 17:40
 */
@Data
@AllArgsConstructor
public class Stock {
    private int total; // 库存总量
    private int used;  // 库存已用
}
