package cn.msss.entity;

import java.io.Serializable;
import java.util.Set;

public class Teacher implements Serializable{

        private Integer id;
        private String T_name;
        private Set<Student> Student;

    public Teacher() {
    }

    public Teacher(Integer id, String t_name, Set<cn.msss.entity.Student> student) {
        this.id = id;
        T_name = t_name;
        Student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", T_name='" + T_name + '\'' +
                ", Student=" + Student +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getT_name() {
        return T_name;
    }

    public void setT_name(String t_name) {
        T_name = t_name;
    }

    public Set<cn.msss.entity.Student> getStudent() {
        return Student;
    }

    public void setStudent(Set<cn.msss.entity.Student> student) {
        Student = student;
    }
}
