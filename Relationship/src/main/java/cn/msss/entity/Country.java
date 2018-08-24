package cn.msss.entity;

import java.io.Serializable;
import java.util.Set;

public class Country implements Serializable {

    private Integer cid;
    private String cname;
    private Set<Provincial> provincialSet;

    public Country(Integer cid, String cname, Set<Provincial> provincialSet) {
        this.cid = cid;
        this.cname = cname;
        this.provincialSet = provincialSet;
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

    public Set<Provincial> getProvincialSet() {
        return provincialSet;
    }

    public void setProvincialSet(Set<Provincial> provincialSet) {
        this.provincialSet = provincialSet;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", provincialSet=" + provincialSet +
                '}';
    }
}
