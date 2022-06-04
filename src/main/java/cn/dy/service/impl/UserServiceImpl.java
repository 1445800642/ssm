package cn.dy.service.impl;

import cn.dy.dao.UserDao;
import cn.dy.pojo.Admin;
import cn.dy.service.UserService;
import cn.dy.util.DaoMapperFactory;

public class UserServiceImpl implements UserService {
    private UserDao dao=(UserDao) DaoMapperFactory.getDao(UserDao.class);

    public Admin login(String username, String password) {
        return dao.login(username,password);
    }
}
