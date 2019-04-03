package com.sodanights.circle.client.aop.advice;

import lombok.Getter;
import lombok.Setter;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.BeanFactory;

import java.lang.reflect.Method;

@Getter
@Setter
public class AroundAdvice implements Advice,MethodInterceptor{

    private Method aspectJAdviceMethod;

    private String aspectInstanceName;

    private BeanFactory beanFactory;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return aspectJAdviceMethod.invoke(beanFactory.getBean(aspectInstanceName), invocation);
    }
}
