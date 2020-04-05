package com.zhiyou100.gym.service;

import com.zhiyou100.gym.pojo.User;

public interface UserService {
    public User findByAccount(String account);
}
