package cn.msss.entity;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable{

    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Set<Teacher> teacher;

    public Student(Integer id, String name, String sex, Integer age, Set<Teacher> teacher) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.teacher = teacher;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(Set<Teacher> teacher) {
        this.teacher = teacher;
    }
}
