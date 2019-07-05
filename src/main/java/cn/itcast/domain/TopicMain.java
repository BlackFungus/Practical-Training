package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;

public class TopicMain implements Serializable {
    private String tid;
    private Integer sid;
    private String title;
    private String context;
    private String file;
    private Date create_time;
    private Date change_time;
    private Integer state;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getChange_time() {
        return change_time;
    }

    public void setChange_time(Date change_time) {
        this.change_time = change_time;
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
                "tid:" + tid +
                ", sid:" + sid +
                ", title:'" + title + '\'' +
                ", context:'" + context + '\'' +
                ", file:'" + file + '\'' +
                ", create_time:" + create_time +
                ", change_time:" + change_time +
                ", state:" + state +
                '}';
    }
}
