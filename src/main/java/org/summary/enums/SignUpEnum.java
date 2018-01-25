package org.summary.enums;

/**
 * Created by CharlesYang on 2018/1/24.
 */
public enum SignUpEnum {
    SUCCESS(1, "注册成功"), NO_NUMBER(0, "已有该用户"),INNER_ERROR(-2, "系统异常");
    private int state;

    private String stateInfo;

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
    private SignUpEnum(int state,String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }
}
