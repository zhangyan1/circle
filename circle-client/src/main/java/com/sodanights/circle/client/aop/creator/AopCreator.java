package com.sodanights.circle.client.aop.creator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.MethodInterceptor;

public class AopCreator implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{

        if(bean instanceof MethodInterceptor){
            return bean;
        }
        return null;
    }
}
