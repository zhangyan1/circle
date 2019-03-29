package com.sodanights.circle.aop.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.sodanights.circle.core.aop.order","com.sodanights.circle.core.user"})
public class AopOrderApplication {



}
