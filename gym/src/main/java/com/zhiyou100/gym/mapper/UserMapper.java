package com.zhiyou100.gym.mapper;

import com.zhiyou100.gym.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    @Select("select * from user where account = #{account}")
    public User findByAccount(String account) ;


}
