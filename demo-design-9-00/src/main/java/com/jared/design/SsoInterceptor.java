package com.jared.design;

/**
 * @author chenjialing
 * @time 2021/6/23 16:47
 */
public class SsoInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        return ticket.equals("success");
    }
}
