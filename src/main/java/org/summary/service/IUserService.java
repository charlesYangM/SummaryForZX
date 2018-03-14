package org.summary.service;

/**
 * Created by CharlesYang on 2018/1/23.
 */
import org.summary.model.User;
import org.summary.exception.SignUpException;

public interface IUserService {

    public User login(String username,String password);

    public int signup(String username,String password);
}