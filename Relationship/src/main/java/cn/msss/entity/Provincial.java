package cn.msss.entity;

import java.io.Serializable;

public class Provincial implements Serializable {

    private Integer pid;
    private String pname;
    private Integer cid;

    public Provincial(Integer pid, String pname, Integer cid) {
        this.pid = pid;
        this.pname = pname;
        this.cid = cid;
    }

    public Provincial() {

    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Provincial{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", cid=" + cid +
                '}';
    }
}
