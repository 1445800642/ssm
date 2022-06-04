package cn.dy.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Serializable {
    private int sid;
    private int age;
    private String sname;
    private String address;
    private Date birthday;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", age=" + age +
                ", sname='" + sname + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Student() {
    }

    public Student(int sid, int age, String sname, String address, Date birthday) {
        this.sid = sid;
        this.age = age;
        this.sname = sname;
        this.address = address;
        this.birthday = birthday;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
