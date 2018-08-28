package cn.msss.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {

    private static SqlSessionFactory factory=null;

    private SqlSessionUtil(){

    }

    public static synchronized SqlSession getSqlSession(){
        try {
            //获取核心配置文件位置并获取到配置信息，返回输入流，
            InputStream stream= Resources.getResourceAsStream("mybatis.xml");
            //通过构造器创建工厂
            factory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //自动提交哦
        return factory.openSession(true);
    }
}
