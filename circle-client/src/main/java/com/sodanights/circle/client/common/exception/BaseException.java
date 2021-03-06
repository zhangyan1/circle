package com.sodanights.circle.client.common.exception;

import com.sodanights.circle.client.common.error.ErrorInfo;
import lombok.Getter;

/**
 * Created by zhangyan on 27/03/2018.
 */
@Getter
public abstract class BaseException extends RuntimeException {
    private ErrorInfo errorInfo;

    public BaseException(ErrorInfo errorInfo) {
        super(toJson(errorInfo));
        this.errorInfo = errorInfo;
    }

    public BaseException(ErrorInfo errorInfo, Throwable cause) {
        super(toJson(errorInfo), cause);
        this.errorInfo = errorInfo;
    }

    public BaseException(ErrorInfo errorInfo, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(toJson(errorInfo), cause, enableSuppression, writableStackTrace);
        this.errorInfo = errorInfo;
    }

    private static String toJson(ErrorInfo errorInfo) {
        return errorInfo == null ? null : errorInfo.toJson();
    }
}
