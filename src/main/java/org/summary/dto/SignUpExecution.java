package org.summary.dto;

/**
 * Created by CharlesYang on 2018/1/24.
 */
import org.summary.enums.SignUpEnum;
import org.summary.model.User;
public class SignUpExecution {
    // 用户名
    private String username;

    // 注册状态
    private int state;

    // 注册状态
    private String stateInfo;

    // 用户对象
    private User user;

    public SignUpExecution(String usename,SignUpEnum signUpEnum){
        this.username = usename;
        this.state = signUpEnum.getState();
        this.stateInfo = signUpEnum.getStateInfo();
    }
    public SignUpExecution(String usename,SignUpEnum signUpEnum,User user){
        this.username = usename;
        this.state = signUpEnum.getState();
        this.stateInfo = signUpEnum.getStateInfo();
        this.user = user;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
