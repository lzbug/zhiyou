package com.zhiyou100.gym.service;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.gym.pojo.Cab;


public interface CabService {
    PageInfo<Cab> queryAll(int pageIndex, String number);
}
