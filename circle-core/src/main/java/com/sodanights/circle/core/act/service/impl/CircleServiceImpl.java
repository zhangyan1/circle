package com.sodanights.circle.core.act.service.impl;

import org.springframework.stereotype.Service;

@Service("circleServiceImpl")
public class CircleServiceImpl {

    public void hello(String person){
        System.out.println("hello:" + person);
    }
}
