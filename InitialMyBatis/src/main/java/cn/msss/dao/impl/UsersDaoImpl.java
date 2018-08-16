package cn.msss.dao.impl;

import cn.msss.dao.UsersDao;
import cn.msss.entity.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class UsersDaoImpl implements UsersDao {


    /**
     * 读取核心配置文件
     */
    public SqlSession getSession(){
        SqlSession session=null;
        try {
            //获取核心配置文件位置并获取到配置信息，返回输入流，
            InputStream stream = Resources.getResourceAsStream("mybatis.xml");
            //通过构造器创建工厂
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
            //在通过工厂获取session
            session = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }

    /**
     * 添加方法
     * @param users
     * @return
     */
    @Override
    public boolean addUser(Users users) {
        boolean fals=false;
        SqlSession session=null;
        try {
            //获取Session对象
            session=getSession();
            int user = session.insert("addUser", users);
            if (user>0){
                System.out.println(fals=true);
                //提交事务
                session.commit();
            }else{
                System.out.println(fals=false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //释放资源
            session.close();
        }
        return fals;
    }


}
