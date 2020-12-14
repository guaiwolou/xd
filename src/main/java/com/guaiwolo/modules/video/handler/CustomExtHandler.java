package com.guaiwolo.modules.video.handler;

import com.guaiwolo.modules.video.utils.JsonData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class CustomExtHandler {

    @ExceptionHandler(value = Exception.class)
    Object handlerException(Exception e, HttpServletRequest request){
        return JsonData.buildError("服务端异常",-2);
    }

}
