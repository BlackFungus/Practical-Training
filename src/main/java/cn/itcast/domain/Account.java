package cn.itcast.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private Integer sid;
    private String username;
    private String password;
    private Integer state;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "{" +
                "sid:" + sid +
                ", username:'" + username + '\'' +
                ", password:'" + password + '\'' +
                ", state:" + state +
                '}';
    }
}
