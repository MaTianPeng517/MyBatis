package cn.msss.entity;

import java.io.Serializable;

public class Provincials implements Serializable {

    private Integer pid;
    private String pname;
    private Integer cid;
    private Country countrys;

    @Override
    public String toString() {
        return "Provincial{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", cid=" + cid +
                ", countrys=" + countrys +
                '}';
    }

    public Provincials() {
    }

    public Provincials(Integer pid, String pname, Integer cid, Country countrys) {
        this.pid = pid;
        this.pname = pname;
        this.cid = cid;
        this.countrys = countrys;
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

    public Country getCountrys() {
        return countrys;
    }

    public void setCountrys(Country countrys) {
        this.countrys = countrys;
    }
}
