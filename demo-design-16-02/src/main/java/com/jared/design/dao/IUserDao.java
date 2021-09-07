package com.jared.design.dao;

import com.jared.design.po.User;

/**
 * @author cjl
 * @time 2021/9/7 11:35
 */
public interface IUserDao {
    User queryUserInfoById(Long id);
}
