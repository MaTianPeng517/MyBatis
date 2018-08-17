package cn.msss.dao;

import cn.msss.entity.Users;

import java.io.Serializable;
import java.util.List;

public interface UsersDao {

    //添加方法
    public boolean addUser(Users users);
    //删除方法
    public int deleteUser(Serializable serializable);
    //修改方法
    public int updeteUser(Serializable serializable);
    //查询条件
    List<Users> selectUser(Serializable serializable);
    //查询所有
    List<Users> query(Users user);
}
