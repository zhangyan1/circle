package com.sodanights.circle.aop.order.test;


import com.sodanights.circle.aop.application.AopOrderApplication;
import com.sodanights.circle.core.act.service.SelfInvocationService;
import com.sodanights.circle.core.act.service.ActService;
import com.sodanights.circle.core.act.service.SleepService;
import com.sodanights.circle.core.act.service.impl.CircleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AopOrderApplication.class)
public class AopAnnotationTest {

    @Resource
    private ActService actService;

    @Resource
    private CircleServiceImpl circleServiceImpl;

    @Resource
    private SelfInvocationService selfInvocationService;

    @Test
    public void testAnnotaion(){
        actService.aopHello("张三");
    }

    @Test
    public void testIntrodu(){
        SleepService sleepService = (SleepService) actService;
        sleepService.sleep();
        actService.aopHello("张三");
    }

    @Test
    public void testCglib(){
        circleServiceImpl.hello("李四");
    }

    @Test
    public void testSelfAop(){
        selfInvocationService.helloTwoPerson("张三","李四");
    }
}
