package com.shan.service;

import com.shan.dao.UserDao;
import com.shan.dao.UserDaoImpl;
import com.shan.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
