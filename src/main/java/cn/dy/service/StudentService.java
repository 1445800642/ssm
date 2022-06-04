package cn.dy.service;

import cn.dy.pojo.Student;

import java.util.List;

public interface StudentService {
    //查找所有学生
    List<Student> getAllStudent();

    //新增学生
    boolean addStudent(Student student);

    //删除学生
    void deleteStudent(String id);

    //查询指定id的学生
    Student findStudentById(String id);

    //修改学生信息
    void updateStudent(Student student);
}
