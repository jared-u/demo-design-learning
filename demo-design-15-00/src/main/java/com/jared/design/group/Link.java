package com.jared.design.group;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cjl
 * @time 2021/9/3 10:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Link {
    private String fromId; // 雇员ID
    private String toId;   // 雇员ID
}
