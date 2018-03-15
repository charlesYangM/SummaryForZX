package org.summary.exception;

import org.apache.shiro.ShiroException;

/**
 * Created by CharlesYang on 2018/1/24.
 */
public class NoUserException extends ShiroException {
    public NoUserException(String message) {
        super(message);
    }

    public NoUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
