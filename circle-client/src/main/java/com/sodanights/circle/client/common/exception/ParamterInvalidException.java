package com.sodanights.circle.client.common.exception;

import com.sodanights.circle.client.common.error.ErrorInfo;

/**
 * Created by zhangyan on 27/03/2018.
 */
public class ParamterInvalidException extends BaseException {
    public ParamterInvalidException(ErrorInfo errorInfo) {
        super(errorInfo);
    }

    public ParamterInvalidException(ErrorInfo errorInfo, Throwable cause) {
        super(errorInfo, cause);
    }

    public ParamterInvalidException(ErrorInfo errorInfo, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(errorInfo, cause, enableSuppression, writableStackTrace);
    }
}
