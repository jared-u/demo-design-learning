package com.jared.design.event.listener;

import com.jared.design.LotteryResult;

/**
 * @author cjl
 * @time 2021/9/9 10:54
 */
public interface EventListener {
    void doEvent(LotteryResult result);
}
