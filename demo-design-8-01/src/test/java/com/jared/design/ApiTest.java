package com.jared.design;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenjialing
 * @time 2021/6/23 12:26
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(EngineController.class);
    @Test
    public void test_EngineController() {
        EngineController engineController = new EngineController();
        String process = engineController.process("Oli09pLkdjh", "man", 29);
        logger.info("测试结果：{}", process);
    }
}
