package com.sodanights.circle.core.aop.order;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Aspect
@Order(1)
public class AnnotationOrderAop {

    @Around(value = "execution(* com.sodanights.circle.core.act..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("A1");
        try {
            Object obj = joinPoint.proceed();
            System.out.println("A2");
            return obj;
        } catch (Throwable throwable) {
            System.out.println("XXXXX");
        }
        return null;
    }

    @Before(value = "within(com.sodanights.circle.core.act..*)")
    public void before(){
        System.out.println("A3");
    }
    /**
    @After(value = "target(com.sodanights.circle.core.act.service.UserInfoService)")
    public void after(){
        System.out.println("A4");
    }

    @AfterReturning(value = "target(com.sodanights.circle.core.act.service.UserInfoService)")
    public void beforeReturn(){
        System.out.println("A5");
    }*/

}
