package cn.msss.dao;

import cn.msss.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface UsersDao {

    //添加方法
    public boolean addUser(Users users);
    //删除方法
    public int deleteUser(Serializable serializable);
    //修改方法
    public int updeteUser(Serializable serializable);
    //查询条件
    public List<Users> selectUser(Serializable serializable);
    //查询所有
    public List<Users> query(Users user);
    //查询Map
    public Users usersMap(Map<String,Object> map);
    //查询下标
    public List<Users> subscript(String user_name,String user_password);
    //查询注解
    public List<Users> annotation(@Param("name") String user_name,@Param("password")String user_password);
    //动态查询
    public List<Users> dynamic(Serializable dynamic);
    //动态修改
    public int modifySet(Serializable modifySet);
    //根据用户传递的参数，执行sql
    public List<Users> chooseTransmit(Serializable chooseTransmit);

}
