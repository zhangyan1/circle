package com.sodanights.circle.aop.order.test;


import com.sodanights.circle.aop.application.AopOrderApplication;
import com.sodanights.circle.core.user.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AopOrderApplication.class)
public class AopAnnotationTest {

    @Resource
    private UserInfoService userInfoService;

    @Test
    public void testAnnotaion(){
        userInfoService.aopHello("张三");
    }
}
