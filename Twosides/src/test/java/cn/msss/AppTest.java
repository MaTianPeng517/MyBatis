package cn.msss;

import static org.junit.Assert.assertTrue;

import cn.msss.dao.Twoway;
import cn.msss.entity.Student;
import cn.msss.entity.Teacher;
import cn.msss.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    SqlSession sqlSession=null;
    Twoway mapper=null;
    @Before
    public void before(){
        sqlSession= SqlSessionUtil.getSqlSession();
        mapper=sqlSession.getMapper(Twoway.class);
    }

    @After
    public void after(){
        sqlSession.close();
    }
    @Test
    public void testS(){
        Student student = mapper.studentById(7);
        System.out.println(student);
    }
    @Test
    public void testT(){
        List<Teacher> teachers = mapper.teacherById(1);
        System.out.println(teachers);
    }
}
