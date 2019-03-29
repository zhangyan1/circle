package com.sodanights.circle.core.aop;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by zhangyan on 27/03/2018.
 */
public class PerformanceInner implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        String name = getName(invocation);
        Profiler.enter(name);
        try {
            return invocation.proceed();
        } finally {
            Profiler.release();
        }
    }

    protected String getName(MethodInvocation invocation) {
        return String.format("%s-%s", invocation.getMethod().getDeclaringClass().getSimpleName(), invocation.getMethod().getName());
    }
}
