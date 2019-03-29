package com.sodanights.circle.client.common.exception;

import com.sodanights.circle.client.common.error.ErrorInfo;

/**
 * Created by zhangyan on 27/03/2018.
 */
public class DatabaseSqlExecuteException extends BaseException {
    public DatabaseSqlExecuteException(ErrorInfo errorInfo) {
        super(errorInfo);
    }

    public DatabaseSqlExecuteException(ErrorInfo errorInfo, Throwable cause) {
        super(errorInfo, cause);
    }

    public DatabaseSqlExecuteException(ErrorInfo errorInfo, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(errorInfo, cause, enableSuppression, writableStackTrace);
    }
}
