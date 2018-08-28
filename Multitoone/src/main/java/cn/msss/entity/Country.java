package cn.msss.entity;

import java.io.Serializable;
import java.util.Set;

public class Country implements Serializable {

    private Integer cid;
    private String cname;

    public Country(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Country() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
