package com.sodanights.circle.core.aop.order;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Aspect
@Order(2)
public class AnnotaionOrderTwoAop {

    @Around(value = "execution(* com.sodanights.circle.core.act..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("B1");
        try {
            Object obj = joinPoint.proceed();
            System.out.println("B2");
            return obj;
        } catch (Throwable throwable) {
            System.out.println("XXXXX");
        }
        return null;
    }

    @Before(value = "within(com.sodanights.circle.core.act..*)")
    public void before(){
        System.out.println("B3");
    }
    /**
     @After(value = "target(com.sodanights.circle.core.act.service.UserInfoService)")
     public void after(){
     System.out.println("B4");
     }

     @AfterReturning(value = "target(com.sodanights.circle.core.act.service.UserInfoService)")
     public void beforeReturn(){
     System.out.println("B5");
     }*/

}
