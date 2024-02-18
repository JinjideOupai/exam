package com.zc.config;

import com.zc.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result throwException(Exception e){
        e.printStackTrace();
        return new Result(500,"error","error");
    }
}
