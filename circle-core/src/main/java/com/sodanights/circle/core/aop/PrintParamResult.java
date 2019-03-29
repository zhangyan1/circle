
package com.sodanights.circle.core.aop;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import java.util.Arrays;

/**
 * Created by zhangyan on 27/03/2018.
 */
@Slf4j
public class PrintParamResult {

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;
        try {
            if (args == null || args.length == 0) {
                result = proceedingJoinPoint.proceed();
            } else {
                result = proceedingJoinPoint.proceed(args);
            }
        } finally {
            log.info("{} param {},result [{}]", proceedingJoinPoint.toString(), Arrays.toString(args), result);
        }
        return result;
    }
}
