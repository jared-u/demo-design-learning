package com.jared.design.test;

import com.alibaba.fastjson.JSON;
import com.jared.design.mediator.Resources;
import com.jared.design.mediator.SqlSession;
import com.jared.design.mediator.SqlSessionFactory;
import com.jared.design.mediator.SqlSessionFactoryBuilder;
import com.jared.design.po.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;

/**
 * @author cjl
 * @time 2021/9/7 11:37
 */
public class ApiTest {
    private Logger logger=LoggerFactory.getLogger(ApiTest.class);
    @Test
    public void test_queryUserInfoById() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlMapper.openSession();
            try {
                User user = session.selectOne("com.jared.design.dao.IUserDao.queryUserInfoById", 1L);
                logger.info("测试结果：{}", JSON.toJSONString(user));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
