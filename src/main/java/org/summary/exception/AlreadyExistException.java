package org.summary.exception;

/**
 * Created by CharlesYang on 2018/1/24.
 */
public class AlreadyExistException extends RuntimeException {
    public AlreadyExistException(String message) {
        super(message);
    }

    public AlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }


}
