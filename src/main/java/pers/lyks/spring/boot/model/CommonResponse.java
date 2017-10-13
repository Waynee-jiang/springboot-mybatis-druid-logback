package pers.lyks.spring.boot.model;

import java.io.Serializable;

/**
 * @author lawyerance
 * @version 1.0 2017-09-24
 */
public class CommonResponse implements Serializable {
    public static final int SUCCESS_CODE = 200;
    public static final int NOT_FOUND = 404;
    public static final int NOSUPPORT_METHOD = 500;

    private int code;
    private String message;
    private Object body;

    public CommonResponse() {

    }

    public CommonResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResponse(int code, String message, Object body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
