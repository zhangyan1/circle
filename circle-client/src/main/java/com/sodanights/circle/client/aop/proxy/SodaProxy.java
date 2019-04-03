package com.sodanights.circle.client.aop.proxy;

import com.sodanights.circle.client.aop.advice.ReflectiveInvocation;
import com.sodanights.circle.client.aop.config.AopConfig;
import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

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
        List<MethodInterceptor> methodInterceptors = this.config.getMethodInterceptors();
        if(methodInterceptors!=null){// TODO 这里加入方法是否过滤
            MethodInterceptor methodInterceptor = methodInterceptors.get(0);//TODO 这里多个循环调用下去
            return methodInterceptor.invoke(new ReflectiveInvocation(this.config.getTargetObject(),method,args));
        }else{
            return method.invoke(this.config.getTargetObject(), args);
        }
    }
}
