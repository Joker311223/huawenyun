package com.yinjiacheng.communitypark.mappers;

import com.yinjiacheng.communitypark.daos.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(int id);
 
    @Insert("INSERT INTO user (name, age) VALUES (#{name}, #{age})")
    int insertUser(User user);
 
    @Update("UPDATE user SET name = #{name}, age = #{age} WHERE id = #{id}")
    int updateUser(User user);
 
    @Delete("DELETE FROM user WHERE id = #{id}")
    int deleteUser(int id);
}