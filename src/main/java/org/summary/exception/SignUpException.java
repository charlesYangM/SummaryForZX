package org.summary.exception;

/**
 * Created by CharlesYang on 2018/1/24.
 */
public class SignUpException extends RuntimeException {
    public SignUpException(String message) {
        super(message);
    }

    public SignUpException(String message, Throwable cause) {
        super(message, cause);
    }

}
