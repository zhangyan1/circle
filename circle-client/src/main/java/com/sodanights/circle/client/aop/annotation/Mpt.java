package com.sodanights.circle.client.aop.annotation;


import java.lang.annotation.*;

@Target(value={ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Mpt{

    Class<?> value();
}
