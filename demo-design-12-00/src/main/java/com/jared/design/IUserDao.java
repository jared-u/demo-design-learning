package com.jared.design;

import com.jared.design.agent.Select;

/**
 * @author cjl
 * @time 2021/9/1 9:32
 */
public interface IUserDao {
    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);
}
