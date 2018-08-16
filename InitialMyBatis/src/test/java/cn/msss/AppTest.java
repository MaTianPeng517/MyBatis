package cn.msss;

import static org.junit.Assert.assertTrue;

import cn.msss.dao.UsersDao;
import cn.msss.dao.impl.UsersDaoImpl;
import cn.msss.entity.Users;
import org.junit.Test;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test(){
        UsersDao usersDao=new UsersDaoImpl();
        Users users=new Users();
        users.setUser_name("嗯");
        users.setUser_password("成功");
        boolean addUser = usersDao.addUser(users);
        if (addUser){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
    }
}
