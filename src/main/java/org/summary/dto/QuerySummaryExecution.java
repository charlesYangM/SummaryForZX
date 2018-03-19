package org.summary.dto;

import org.summary.enums.QueryEnum;
import org.summary.model.Summary;

/**
 * Created by CharlesYang on 2018/3/19.
 */
public class QuerySummaryExecution {
    //用户名称
    private String username;

    // 查询
    private int state;

    // 查询状态信息
    private String stateInfo;

    // 总结对象
    private Summary summary;

    public QuerySummaryExecution(Summary summary,QueryEnum queryEnum){
        this.summary = summary;
        this.state = queryEnum.getState();
        this.stateInfo = queryEnum.getStateInfo();
    }

    public QuerySummaryExecution(String username,QueryEnum queryEnum){
        this.username = username;
        this.state = queryEnum.getState();
        this.stateInfo = queryEnum.getStateInfo();
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

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
}
