package com.zhiyou100.gym.service.impl;

import com.zhiyou100.gym.mapper.SignMapper;
import com.zhiyou100.gym.pojo.Sign;
import com.zhiyou100.gym.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {
    @Autowired
    private SignMapper signMapper;
    @Override
    public List<Sign> queryAll() {
        return signMapper.queryAll();
    }

    @Override
    public Integer add() {
        return signMapper.add();
    }
}
