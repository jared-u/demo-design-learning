package com.jared.design;

/**
 * @author chenjialing
 * @time 2021/6/23 16:57
 */
public abstract class SsoDecorator implements HandlerInterceptor{
    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator(){}

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
