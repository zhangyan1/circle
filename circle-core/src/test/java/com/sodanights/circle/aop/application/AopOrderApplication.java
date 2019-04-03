package com.sodanights.circle.aop.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.TestPropertySource;


@SpringBootApplication
@ComponentScan(basePackages = {"com.sodanights.circle.core.aop.order","com.sodanights.circle.core.user",
        "com.sodanights.circle.dal.user"})
@MapperScan(basePackages = {"com.sodanights.circle.dal.user.mapper"})
public class AopOrderApplication {

}
