package com.sodanights.circle.client.aop.filter;

import com.sodanights.circle.client.aop.poincut.Pointcut;

public class AopFilter {

    public static boolean matchClass(Pointcut pointcut,Object object){
        if(pointcut.getTargetClass().isAssignableFrom(object.getClass())){
            return true;
        }
        return false;
    }
}
