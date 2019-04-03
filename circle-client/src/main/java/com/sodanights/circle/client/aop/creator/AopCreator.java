package com.sodanights.circle.client.aop.creator;

import com.sodanights.circle.client.aop.advisor.Advisor;
import com.sodanights.circle.client.aop.filter.AopFilter;
import com.sodanights.circle.client.aop.proxy.ProxyFacatory;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AopCreator implements BeanPostProcessor,BeanFactoryAware,ApplicationContextAware {

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
        if(bean instanceof MethodInterceptor){
            return bean;
        }
        Map<String,Advisor> advisorMap = applicationContext.getBeansOfType(Advisor.class);
        if(advisorMap.size() == 0){
            return bean;
        };
        List<MethodInterceptor> methodInterceptors = new ArrayList<>();
        for(Advisor advisor:advisorMap.values()){
            if(!AopFilter.matchClass(advisor.getPointcut(),bean)){
                continue;
            }
            methodInterceptors.add((MethodInterceptor) advisor.getAdvice());
        }
        if(methodInterceptors.size() == 0){
            return bean;
        }

        ProxyFacatory proxyFacatory = new ProxyFacatory();
        proxyFacatory.setTargetClass(bean.getClass());
        proxyFacatory.setTargetInterfaces(bean.getClass().getInterfaces());
        proxyFacatory.setTargetObject(bean);
        proxyFacatory.setMethodInterceptors(methodInterceptors);
        return proxyFacatory.getProxy();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
