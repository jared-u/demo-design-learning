package com.jared.design.agent;

import java.lang.annotation.*;

/**
 * @author cjl
 * @time 2021/9/1 9:33
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {
    String value() default "";  // sql语句
}
