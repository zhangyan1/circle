package com.sodanights.circle.aop.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class})
@ComponentScan(basePackages = {"com.sodanights.circle.client.aop.creator","com.sodanights.circle.core.aspect","com.sodanights.circle.core.act"})
public class SodaAopApplication {
}
