package com.sodanights.circle.core.act.service.impl;


import com.sodanights.circle.client.aop.annotation.Apt;
import com.sodanights.circle.client.aop.annotation.Mpt;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Service;

@Apt
@Service
public class SodaAspect implements MethodInterceptor {

    @Override
    @Mpt
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕前");
        Object object = invocation.proceed();
        System.out.println("环绕后");
        return object;
    }
}
