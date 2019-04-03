package com.sodanights.circle.aop.order.test;


import com.sodanights.circle.aop.application.AopOrderApplication;
import com.sodanights.circle.aop.application.MyBatiesApplication;
import com.sodanights.circle.client.user.query.UserQuery;
import com.sodanights.circle.core.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyBatiesApplication.class)
public class MybatiesTest {

    @Resource
    private UserService userService;

    @Test
    public void test(){
        UserQuery query = new UserQuery();
        System.out.println(userService.getUserDomain(query));
    }
}
