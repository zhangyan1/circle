package com.sodanights.circle.core.aop.order;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Aspect
@Order(1)
@Service
public class AnnotationOrderAop {

    @Around(value = "execution(* com.sodanights.circle.core.user.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("A");
        try {
            Object obj = joinPoint.proceed();
            System.out.println("B");
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;

    }

}
