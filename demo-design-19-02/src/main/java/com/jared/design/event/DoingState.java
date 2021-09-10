package com.jared.design.event;

import com.jared.design.ActivityService;
import com.jared.design.Result;
import com.jared.design.State;
import com.jared.design.Status;

/**
 * @author cjl
 * @time 2021/9/10 11:59
 */
public class DoingState extends State {
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可提审");
    }

    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可审核通过");
    }

    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可审核拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可撤销审核");
    }

    public Result close(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.Close);
        return new Result("0000", "活动关闭成功");
    }

    public Result open(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可开启");
    }

    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动中不可重复执行");
    }
}
