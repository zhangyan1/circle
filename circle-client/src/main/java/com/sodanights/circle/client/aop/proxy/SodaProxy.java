package com.sodanights.circle.client.aop.proxy;

import com.sodanights.circle.client.aop.config.AopConfig;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SodaProxy implements InvocationHandler{

    private AopConfig config;

    public SodaProxy(AopConfig config){
        this.config = config;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(getClass().getClassLoader(), config.getTargetInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ggg");
        return method.invoke(args);
    }
}
