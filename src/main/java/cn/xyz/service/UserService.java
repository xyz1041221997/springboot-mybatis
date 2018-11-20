package cn.xyz.service;

import cn.xyz.entity.User;

public interface UserService {

    public boolean inserUser(String username,String password);

    public User selectUser(String username,String password);

}
