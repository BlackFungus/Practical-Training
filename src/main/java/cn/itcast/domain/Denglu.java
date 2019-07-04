package cn.itcast.domain;

public class Denglu {
    private Integer sid;
    private String username;
    private String password;

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

    @Override
    public String toString() {
        return "{" +
                "sid:" + sid +
                ", username:'" + username + '\'' +
                ", password:'" + password + '\'' +
                '}';
    }
}
