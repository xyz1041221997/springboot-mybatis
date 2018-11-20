package cn.xyz.service;

import cn.xyz.dao.UserDao;
import cn.xyz.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl{

    @Autowired
    private UserDao userDao;


    public boolean inserUser(String username, String password) {
         userDao.inserUser(username,password);
         return true;
    }

    public User selectUser(String username,String password) {
        
        System.out.println(username+" "+username);
        return userDao.selectUser(username,password);
        
    }
}
