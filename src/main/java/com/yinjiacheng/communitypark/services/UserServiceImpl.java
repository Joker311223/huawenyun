package com.yinjiacheng.communitypark.services;

import com.yinjiacheng.communitypark.daos.User;
import com.yinjiacheng.communitypark.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
 
    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
 
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
 
    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
 
    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}