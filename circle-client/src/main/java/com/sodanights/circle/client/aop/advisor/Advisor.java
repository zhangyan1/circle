package com.sodanights.circle.client.aop.advisor;

import com.sodanights.circle.client.aop.advice.Advice;
import com.sodanights.circle.client.aop.poincut.Pointcut;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Advisor{

    private Advice advice;
    private Pointcut pointcut;

    public Advisor(Advice advice){
        this.advice = advice;
    }
}
