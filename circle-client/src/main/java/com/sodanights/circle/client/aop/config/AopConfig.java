package com.sodanights.circle.client.aop.config;

import lombok.Getter;
import lombok.Setter;
import org.aopalliance.intercept.MethodInterceptor;


import java.util.List;

@Getter
@Setter
public class AopConfig {
    /**
     * 被代理类的接口
     */
    private Class<?>[] targetInterfaces;

    private Object targetObject;

    private Class<?> targetClass;

    private List<MethodInterceptor> methodInterceptors;
}
