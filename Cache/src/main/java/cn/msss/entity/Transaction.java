package cn.msss.entity;

import java.io.Serializable;

public class Transaction implements Serializable{

    private String name;
    private String money;
    private Integer id;

    public Transaction() {
    }

    public Transaction(String name, String money, Integer id) {
        this.name = name;
        this.money = money;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
