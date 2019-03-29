package com.sodanights.circle.client.common.error;


/**
 * Created by zhangyan on 27/03/2018.
 */
public interface Errors{


    ErrorInfo PARAMS_ERROR = new ErrorInfo(10001,"PARAMS_ERROR","param is error");
    ErrorInfo SERVICE_ERROR = new ErrorInfo(10002,"SERVICE_ERROR","service is error");
    ErrorInfo FAILURE = new ErrorInfo(10003,"FAILURE","FAILURE");

}