package pers.lyks.spring.boot.exception;

/**
 * The request exception hand
 *
 * @author lawyerance
 * @version 1.0 2017-09-23
 */
public class ResultHandlerException extends RuntimeException {
    private int code;

    public ResultHandlerException(int code) {
        super();
        this.code = code;
    }

    public ResultHandlerException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ResultHandlerException(int code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }

    public ResultHandlerException(int code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

