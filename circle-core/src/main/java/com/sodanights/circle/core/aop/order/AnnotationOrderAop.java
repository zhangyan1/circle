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

    @Around(value = "execution(* com.sodanights.circle.core.user..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("A");
        try {
            Object obj = joinPoint.proceed();
            System.out.println("B");
            return obj;
        } catch (Throwable throwable) {
            System.out.println("XXXXX");
        }
        return null;
    }

    @Before(value = "within(com.sodanights.circle.core.user..*)")
    public void before(){
        System.out.println("C");
    }
    /**
    @After(value = "target(com.sodanights.circle.core.user.service.UserInfoService)")
    public void after(){
        System.out.println("D");
    }

    @AfterReturning(value = "target(com.sodanights.circle.core.user.service.UserInfoService)")
    public void beforeReturn(){
        System.out.println("E");
    }*/

}
