package com.sodanights.circle.aop.application;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sodanights.circle.core.user", "com.sodanights.circle.dal.user"})
@MapperScan(basePackages = {"com.sodanights.circle.dal.user.mapper"})
public class MyBatiesApplication {
}
