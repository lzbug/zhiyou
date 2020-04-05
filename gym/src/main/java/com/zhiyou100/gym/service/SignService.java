package com.zhiyou100.gym.service;

import com.zhiyou100.gym.pojo.Sign;

import java.util.List;

public interface SignService {
    public List<Sign> queryAll();
    public Integer add(Sign sign);
}
