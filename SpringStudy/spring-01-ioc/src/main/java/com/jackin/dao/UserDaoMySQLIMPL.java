package com.jackin.dao;

public class UserDaoMySQLIMPL implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySQL获取用户数据");
    }
}
