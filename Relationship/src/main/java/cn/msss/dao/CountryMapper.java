package cn.msss.dao;

import cn.msss.entity.Country;

import java.io.Serializable;

public interface CountryMapper {
    //查询国家下有多少的省会
    public Country countrySE(Serializable countrySE);
}
