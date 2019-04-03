package com.sodanights.circle.client.aop.creator;

import com.sodanights.circle.client.aop.advice.AroundAdvice;
import com.sodanights.circle.client.aop.advisor.Advisor;
import com.sodanights.circle.client.aop.annotation.Apt;
import com.sodanights.circle.client.aop.annotation.Mpt;
import com.sodanights.circle.client.aop.filter.AopFilter;
import com.sodanights.circle.client.aop.proxy.ProxyFacatory;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.aspectj.AspectJPointcutAdvisor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AopCreator implements BeanPostProcessor,ApplicationContextAware {

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    private List<RootBeanDefinition> rootBeanDefinitions = new ArrayList<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{

        initAdvisor(bean,beanName);
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

    private boolean initAdvisor(Object bean, String beanName){
        Apt apt = bean.getClass().getAnnotation(Apt.class);
        if(apt == null){
            return false;
        }
        Method[] methods = bean.getClass().getMethods();
        for(Method method:methods){
            Mpt mpt = method.getAnnotation(Mpt.class);
            if(mpt == null){
                continue;
            }
            AroundAdvice aroundAdvice = new AroundAdvice();
            aroundAdvice.setAspectInstanceName(beanName);
            aroundAdvice.setBeanFactory(beanFactory);
            aroundAdvice.setAspectJAdviceMethod(method);
            RootBeanDefinition advisorDefinition = new RootBeanDefinition(Advisor.class);
            constructor(advisorDefinition, aroundAdvice);
            rootBeanDefinitions.add(advisorDefinition);
            ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) applicationContext;
            DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableApplicationContext
                    .getBeanFactory();
            defaultListableBeanFactory.registerBeanDefinition(beanName+"advisor", advisorDefinition);
        }
        return true;
    }

    public static final void constructor(BeanDefinition beanDefinition, Object... args) {
        if (beanDefinition == null || args == null || args.length <= 0) {
            return;
        }
        ConstructorArgumentValues constructorArgumentValues = beanDefinition.getConstructorArgumentValues();
        for (int i = 0; i < args.length; i++) {
            if (args[i] == null) {
                continue;
            }
            constructorArgumentValues.addIndexedArgumentValue(i, args[i]);

        }
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /*@Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("开始注册advisor拉 size:"+rootBeanDefinitions.size());
        for(RootBeanDefinition iter:rootBeanDefinitions){
            registry.registerBeanDefinition(iter.getBeanClassName(),iter);
        }
    }*/

}
