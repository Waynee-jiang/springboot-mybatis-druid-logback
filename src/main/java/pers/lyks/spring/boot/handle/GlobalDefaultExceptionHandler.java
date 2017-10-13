package pers.lyks.spring.boot.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;
import pers.lyks.spring.boot.exception.ResultHandlerException;
import pers.lyks.spring.boot.model.CommonResponse;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * The global handler occurring exception.
 * @author lawyerance
 * @version 1.0 2017-09-23
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Serializable errorHandle(HttpServletRequest request, Exception ex) throws Exception {
        String requestUri = request.getRequestURI();
        logger.error("Request URI: {}", requestUri, ex);
        CommonResponse response = new CommonResponse();
        if (ex instanceof NoHandlerFoundException) {
            response.setCode(CommonResponse.NOT_FOUND);
        } else if (ex instanceof HttpRequestMethodNotSupportedException) {
            response.setCode(CommonResponse.NOSUPPORT_METHOD);
        } else if (ex instanceof ResultHandlerException) {
            response.setCode(((ResultHandlerException) ex).getCode());
        } else {
            //
        }
        response.setMessage(ex.getMessage());
        return response;
    }
}
