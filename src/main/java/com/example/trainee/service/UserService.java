package com.example.trainee.service;


import com.example.trainee.beans.User;
import com.example.trainee.dao.UserDao;

import java.util.Set;

public class UserService {
    public static Set<User> printUsers() {
        UserDao userDao = new UserDao();
        return userDao.getAllUsers();
    }

    public static void deleteById(int id) {
        UserDao userDao = new UserDao();
        userDao.deleteUserById(id);
    }

    public static void addUser(User user) {
        UserDao userDao = new UserDao();
        userDao.addUser(user);
    }

    public static User findById(int id) {
        UserDao userDao = new UserDao();
        return userDao.selectById(id);
    }

    public static int update(User user) {
        UserDao userDao = new UserDao();
        return userDao.updateUser(user);
    }
}
