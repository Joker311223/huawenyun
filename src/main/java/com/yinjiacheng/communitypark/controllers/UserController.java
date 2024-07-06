package com.yinjiacheng.communitypark.controllers;

import com.yinjiacheng.communitypark.daos.User;
import com.yinjiacheng.communitypark.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
 
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
 
    @PostMapping
    public int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
 
    @PutMapping("/{id}")
    public int updateUser(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return userService.updateUser(user);
    }
 
    @DeleteMapping("/{id}")
    public int deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }
}