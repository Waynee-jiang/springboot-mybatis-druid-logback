package pers.lyks.spring.boot.controller;

import com.alibaba.fastjson.JSONObject;

/**
 * The base controller class.
 *
 * @author lawyerance
 * @version 1.0 2017-05-10
 */
public class BaseController {
    private final static String DEFAULT_KEY_CODE = "code";
    private final static String DEFAULT_KEY_MESSAGE = "msg";
    private final static String DEFAULT_KEY_BODY = "body";
    private final static String KEY_DATA = "data";

    public final static String CHARSET_UTF8 = "UTF-8";
    protected final static int SUCCESS_CODE = 200;

    protected Object success(String msg) {
        return noBody(SUCCESS_CODE, msg);
    }

    protected Object success(String msg, Object body) {
        return body(SUCCESS_CODE, msg, body);
    }

    protected Object noBody(int code, String msg) {
        return definedBody(code, msg, null, null);
    }

    protected Object data(int code, String msg, Object body) {
        return definedBody(code, msg, KEY_DATA, body);
    }

    protected Object body(int code, String msg, Object body) {
        return definedBody(code, msg, DEFAULT_KEY_BODY, body);
    }

    protected Object definedBody(int code, String message, String keyBody, Object body) {
        return defined(DEFAULT_KEY_CODE, code, DEFAULT_KEY_MESSAGE, message, keyBody, body);
    }

    protected Object defined(String keyCode, int code, String keyMessage, String message, String keyBody, Object body) {
        return format(keyCode, code, keyMessage, message, keyBody, body);
    }


    private static JSONObject format(String keyCode, int code, String keyMessage, String message, String keyBody, Object body) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(keyCode, code);
        jsonObject.put(keyMessage, message);
        if (keyBody != null && keyBody.length() > 0) {
            jsonObject.put(keyBody, body);
        }
        return jsonObject;
    }
}
