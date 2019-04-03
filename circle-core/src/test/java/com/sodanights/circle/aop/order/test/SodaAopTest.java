package com.sodanights.circle.aop.order.test;
import com.sodanights.circle.aop.application.SodaAopApplication;
import com.sodanights.circle.core.act.service.ActService;
import com.sodanights.circle.core.aspect.SodaAspect;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SodaAopApplication.class)
public class SodaAopTest {

    @Resource
    private ActService actService;

    @Test
    public void test(){
        actService.aopHello("张三");
    }
}
