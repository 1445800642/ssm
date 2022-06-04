package cn.dy.service;

import cn.dy.pojo.Admin;

public interface UserService {

    //登录
    Admin login(String username, String password);


}
