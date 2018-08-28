package cn.msss.dao;

import cn.msss.entity.Student;
import cn.msss.entity.Teacher;

import java.io.Serializable;
import java.util.List;

public interface Twoway {

    public Student studentById(Serializable id);

    public List<Teacher>  teacherById(Serializable id);
}
