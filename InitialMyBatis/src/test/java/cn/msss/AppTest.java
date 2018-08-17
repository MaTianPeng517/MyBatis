package cn.msss;

import static org.junit.Assert.assertTrue;

import cn.msss.dao.UsersDao;
import cn.msss.entity.Users;
import cn.msss.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    SqlSession sqlSession=null;
    UsersDao mapper=null;

    @Before
    public void before(){
        sqlSession = SqlSessionUtil.getSqlSession();
        mapper= sqlSession.getMapper(UsersDao.class);
    }

    @After
    public void after(){
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 添加操作
     */
    @Test
    public void addUser(){
        Users users=new Users();
        users.setUser_name("Tina");
        users.setUser_password("123456");
        boolean b = mapper.addUser(users);
        if (b){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
    /**
     *删除操作
     */
    @Test
    public void deleteUser(){
        Users users=new Users();
        users.setUser_id(1);
        int i = mapper.deleteUser(users);
        if(i>0){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
    }
    /**
     *查询操作
     */
    @Test
    public void query(){
        Users users=new Users();
        List<Users> list = mapper.query(users);
        System.out.println(list);
    }
    /**
     *查询条件操作
     */
    @Test
    public void selectUser(){
        Users users=new Users();
        users.setUser_id(33);
        List<Users> list = mapper.selectUser(users);
        System.out.println(list);
    }
    /**
     *修改操作
     */
    @Test
    public void updeteUser(){
        Users users=new Users();
        users.setUser_name("哈哈");
        users.setUser_password("789654");
        users.setUser_file("回龙观");
        users.setUser_id(33);
        int i = mapper.updeteUser(users);
        if (i>0) {
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
