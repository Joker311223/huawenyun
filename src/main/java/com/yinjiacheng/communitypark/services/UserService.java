package com.yinjiacheng.communitypark.services;

import com.yinjiacheng.communitypark.daos.User;

public interface UserService {
    User getUserById(int id);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}