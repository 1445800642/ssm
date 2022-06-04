package cn.dy.service.impl;

import cn.dy.dao.StudentDao;
import cn.dy.pojo.Student;
import cn.dy.service.StudentService;
import cn.dy.util.DaoMapperFactory;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao=(StudentDao) DaoMapperFactory.getDao(StudentDao.class);

    //查找所有学生
    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }

    //新增学生
    public boolean addStudent(Student student) {
        int flag=dao.addStudent(student);
        if (flag==0){
            return false;
        }else {
            return true;
        }
    }

    //删除学生
    public void deleteStudent(String id) {
        dao.deleteStudent(Integer.parseInt(id));
    }

    //查询指定id的学生
    public Student findStudentById(String id) {
        System.out.println(id+"serviceimpl");
        return dao.findStudentById(Integer.parseInt(id));
    }

    //修改学生信息
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }
}
