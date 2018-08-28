package cn.msss.dao;

import cn.msss.entity.Transaction;

import java.io.Serializable;

public interface TransactionDao  {

    //查询
    /**
     * 2级缓存
     */
    public Transaction cache(Serializable ca);
    //修改
    public Transaction upcache(Serializable ca);
}
