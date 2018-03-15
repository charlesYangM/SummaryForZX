package org.summary.service.impl;

/**
 * Created by CharlesYang on 2018/1/23.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.summary.dao.IUserDao;
import org.summary.model.User;
import org.summary.service.IUserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;


    public User login(String username,String password) {

        return this.userDao.login(username,password);
    }

    @Override
    public int signup(String username, String password) {

        return this.userDao.signup(username,password);
    }

    @Override
    public User getByUsername(String username) {
        return this.userDao.getByUsername(username);
    }

}