package com.jared.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author cjl
 * @time 2021/9/10 11:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityInfo {
    private String activityId;    // 活动ID
    private String activityName;  // 活动名称
    private Enum<Status> status;  // 活动状态
    private Date beginTime;       // 开始时间
    private Date endTime;         // 结束时间

}
