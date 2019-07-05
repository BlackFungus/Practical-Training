package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;

public class TopicReply implements Serializable {
    private String rid;
    private Integer sid;
    private String tid;
    private String context;
    private String file;
    private Date create_time;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
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

    @Override
    public String toString() {
        return "{" +
                "rid:'" + rid + '\'' +
                ", sid:" + sid +
                ", tid:'" + tid + '\'' +
                ", context:'" + context + '\'' +
                ", file:'" + file + '\'' +
                ", create_time:" + create_time +
                '}';
    }
}
