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

import java.util.*;

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
        users.setUser_name("呵呵");
        users.setUser_password("123456");
        boolean b = mapper.addUser(users);
        if (b){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
        System.out.println(users.getUser_id());
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
        users.setUser_id(34);
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
    /**
     * Map
     */
    @Test
    public void usersMap(){
        Map<String,Object> map=new HashMap<String,Object>();
        Users userss=new Users();
        userss.setUser_name("Tina");
        userss.setUser_password("123456");
        map.put("users",userss);
        Users users = mapper.usersMap(map);
        System.out.println(users);
    }
    /**
     *下标
     */
    @Test
    public void subscript(){
        List<Users> tina = mapper.subscript("Tina", "123456");
        System.out.println(tina);
    }
    /**
     *注解
     */
    @Test
    public void annotation(){
        List<Users> tina = mapper.annotation("Tina", "123456");
        System.out.println(tina);
    }
    /**
     * 动态查询
     */
    @Test
    public void dynamic(){
        Users users=new Users();
        users.setUser_password("123456");
        List<Users> dynamic = mapper.dynamic(users);
        System.out.println(dynamic);
    }
    /**
     * 动态修改
     */
    @Test
    public void modifySet(){
        Users users=new Users();
        users.setUser_id(43);
        users.setUser_name("嘿嘿");
        users.setUser_password("456789");
        users.setUser_file("随便");
        int i = mapper.modifySet(users);
        System.out.println(i);
    }
    /**
     * 根据用户传递的参数，执行sql
     */
    @Test
    public void chooseTransmit(){
        Users users=new Users();
        //users.setUser_id(1);
        //users.setUser_name("");
       // users.setUser_password("");
        users.setUser_file("随便");
        mapper.chooseTransmit(users);
    }
    /**
     * LIst foreach遍历查询 单一
     */
    @Test
    public void ergodic(){
        List<Integer> list=new ArrayList<>();
        list.add(41);
        list.add(43);
        List<Users> ergodic = mapper.ergodic(list);
        System.out.println(ergodic);
    }
    /**
     * LIst foreach遍历查询 对象
     */
    @Test
    public void target(){
        List<Users> list=new ArrayList<>();
        Users users=new Users(41);
        Users userss=new Users(43);
        list.add(users);
        list.add(userss);
        List<Users> target = mapper.target(list);
        System.out.println(target);
    }

    /**
     * 使用key
     */
    @Test
    public void key(){
        Map<String,Integer> map=new HashMap<>();
        map.put("41",41);
        map.put("43",43);
        List<Users> key = mapper.key(map);
        System.out.println(key);
    }
    /**
     *使用value
     */
    @Test
    public void value(){
        Map<String,Integer> map=new HashMap<>();
        map.put("41",41);
        map.put("43",43);
        List<Users> value = mapper.value(map);
        System.out.println(value);
    }
    /**
     *使用对象
     */
    @Test
    public void maptarget(){
        Map<String,Users> map=new HashMap<>();
        Users u1=new Users(41);
        Users u2=new Users(43);
        map.put("41",u1);
        map.put("43",u2);
        List<Users> maptarget = mapper.maptarget(map);
        System.out.println(maptarget);
    }
    /**
     * 数组遍历查询
     */
    @Test
    public void array(){
        Integer [] in={41,43};
        List<Users> array = mapper.array(in);
        System.out.println(array);
    }
}
