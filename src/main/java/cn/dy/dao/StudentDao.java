package cn.dy.dao;

import cn.dy.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    //查找所有学生
    List<Student> getAllStudent();

    //新增学生
    int addStudent(Student student);

    //删除学生
    void deleteStudent(@Param("id")int i);

    //查询指定id的学生
    Student findStudentById(@Param("id")int i);

    //修改学生信息
    void updateStudent(Student student);
}
