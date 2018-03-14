package org.summary.exception;

/**
 * Created by CharlesYang on 2018/1/24.
 */
public class NoUserException extends RuntimeException{
    public NoUserException(String message) {
        super(message);
    }

    public NoUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
