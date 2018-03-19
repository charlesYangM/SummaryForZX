package org.summary.model;

import java.io.Serializable;

/**
 * Created by CharlesYang on 2018/1/23.
 */


public class User implements Serializable{

    private String password;
    private String username;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    private String salt;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

}