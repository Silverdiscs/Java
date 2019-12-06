package com.jackin.service;

import com.jackin.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;  // 业务层调用 Dao层

    // 利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
