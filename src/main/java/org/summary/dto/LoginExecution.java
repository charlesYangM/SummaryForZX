package org.summary.dto;

import org.summary.enums.LoginEnum;
import org.summary.model.User;

/**
 * Created by CharlesYang on 2018/3/15.
 */
public class LoginExecution {

    // 用户名
    private String username;

    // 登录状态
    private int state;

    // 登录状态信息
    private String stateInfo;

    // 用户对象
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public LoginExecution(String usename, LoginEnum loginEnum){
        this.username = usename;
        this.state = loginEnum.getState();
        this.stateInfo = loginEnum.getStateInfo();
    }
    public LoginExecution(String usename, LoginEnum loginEnum, User user){
        this.username = usename;
        this.state = loginEnum.getState();
        this.stateInfo = loginEnum.getStateInfo();
        this.user = user;
    }
}
