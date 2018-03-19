package org.summary.enums;

/**
 * Created by CharlesYang on 2018/3/19.
 */
public enum QueryEnum {
    SUCCESS(1, "查询成功"), NO_NUMBER(0, "该日期没有总结"),INNER_ERROR(-2, "系统异常");
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
    private QueryEnum(int state,String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }
}
