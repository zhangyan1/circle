package com.sodanights.circle.client.aop.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AopConfig {
    /**
     * 被代理类的接口
     */
    private Class<?>[] interfaces;
}
