package com.zhiyou100.gym.service.impl;


import com.zhiyou100.gym.mapper.UserMapper;
import com.zhiyou100.gym.pojo.User;
import com.zhiyou100.gym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByAccount(String account) {
        if (StringUtils.isEmpty(account)){
            return null;
        }
        return userMapper.findByAccount(account);
    }
}
