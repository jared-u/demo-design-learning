package com.jared.design.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenjialing
 * @time 2021/6/21 15:35
 */
public class PayFingerprintMode implements IPayMode {
    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
