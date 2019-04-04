package com.sodanights.circle.core.aop.order;


import com.sodanights.circle.core.act.service.SleepService;
import com.sodanights.circle.core.act.service.impl.SleepServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IntrodutionAop {

    @DeclareParents(value = "com.sodanights.circle.core.act.service.ActService+", defaultImpl = SleepServiceImpl.class)
    public SleepService sleepService;
}
