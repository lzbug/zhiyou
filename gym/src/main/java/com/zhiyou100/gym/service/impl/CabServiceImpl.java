package com.zhiyou100.gym.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.gym.mapper.CabMapper;
import com.zhiyou100.gym.pojo.Cab;
import com.zhiyou100.gym.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CabServiceImpl implements CabService {
    @Autowired
    private CabMapper cabMapper;

    @Override
    public PageInfo<Cab> queryAll(int pageIndex, String number) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("number",number);
        int pagesize=3;
        PageHelper.startPage(pageIndex,pagesize);
        List<Cab> cabs = cabMapper.queryAll(map);
        PageInfo<Cab> info = new PageInfo<Cab>(cabs);
        return info;
    }
}
