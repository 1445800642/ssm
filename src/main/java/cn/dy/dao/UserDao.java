package cn.dy.dao;

import cn.dy.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

     //登录
    Admin login(@Param("username") String username, @Param("password") String password);
}
