package com.sodanights.circle.core.aop.order;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Aspect
@Order(1)
@Service
public class SelfAop {


    @Before(value = "execution(* com.sodanights.circle.core.act.service.SelfInvocationService.hello(..))")
    public void before(){
        System.out.println("调用前增强");
    }
}
