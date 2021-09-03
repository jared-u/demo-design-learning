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
public class Employee {
    private String uId;   // ID
    private String name;  // 姓名
    private String desc;  // 备注

}
