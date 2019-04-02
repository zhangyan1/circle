package com.sodanights.circle.core.user.service.impl;

import com.sodanights.circle.core.user.service.SelfInvocationService;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;


@Service("selfInvocationService")
public class SelfInvocationServiceImpl implements SelfInvocationService{


    @Override
    public void helloTwoPerson(String personOne, String personTwo) {
        /*((SelfInvocationService) AopContext.currentProxy()).hello(personOne);
        ((SelfInvocationService) AopContext.currentProxy()).hello(personTwo);*/
        hello(personOne);
        hello(personTwo);
    }

    @Override
    public void hello(String person) {
        System.out.println("hello:"+ person);
    }
}
