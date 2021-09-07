package com.jared.design;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author cjl
 * @time 2021/9/7 12:22
 */
@Data
@AllArgsConstructor
public class ConfigFile {
    private String versionNo; // 版本号
    private String content;   // 内容
    private Date dateTime;    // 时间
    private String operator;  // 操作人
}
