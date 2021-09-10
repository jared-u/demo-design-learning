package com.jared.design.test;

import com.alibaba.fastjson.JSON;
import com.jared.design.ActivityService;
import com.jared.design.Result;
import com.jared.design.StateHandler;
import com.jared.design.Status;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cjl
 * @time 2021/9/10 12:13
 */
public class ApiTest {
    private Logger logger=LoggerFactory.getLogger(ApiTest.class);
    @Test
    public void test_Editing2Arraignment() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);
        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.arraignment(activityId, Status.Editing);
        logger.info("测试结果(编辑中To提审活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
    @Test
    public void test_Editing2Open() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);
        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.open(activityId, Status.Editing);
        logger.info("测试结果(编辑中To开启活动)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
    @Test
    public void test_Refuse2Doing() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Refuse);
        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.doing(activityId, Status.Refuse);
        logger.info("测试结果(拒绝To活动中)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
    @Test
    public void test_Refuse2Revoke() {
        String activityId = "100001";
        ActivityService.init(activityId, Status.Refuse);
        StateHandler stateHandler = new StateHandler();
        Result result = stateHandler.checkRevoke(activityId, Status.Refuse);
        logger.info("测试结果(拒绝To撤审)：{}", JSON.toJSONString(result));
        logger.info("活动信息：{} 状态：{}", JSON.toJSONString(ActivityService.queryActivityInfo(activityId)), JSON.toJSONString(ActivityService.queryActivityInfo(activityId).getStatus()));
    }
}
