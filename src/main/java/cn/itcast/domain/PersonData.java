package cn.itcast.domain;

import java.io.Serializable;

public class PersonData implements Serializable {
    private Integer sid;
    private String name;
    private String nativePlace;
    private String ID_No;
    private String Email;
    private Integer phoneNum;
    private String ClassNum;
    private Integer QQNum;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getID_No() {
        return ID_No;
    }

    public void setID_No(String ID_No) {
        this.ID_No = ID_No;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getClassNum() {
        return ClassNum;
    }

    public void setClassNum(String classNum) {
        ClassNum = classNum;
    }

    public Integer getQQNum() {
        return QQNum;
    }

    public void setQQNum(Integer QQNum) {
        this.QQNum = QQNum;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", ID_No='" + ID_No + '\'' +
                ", Email='" + Email + '\'' +
                ", phoneNum=" + phoneNum +
                ", ClassNum='" + ClassNum + '\'' +
                ", QQNum=" + QQNum +
                '}';
    }
}
