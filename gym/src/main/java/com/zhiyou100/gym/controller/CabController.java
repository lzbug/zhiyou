package com.zhiyou100.gym.controller;

import com.github.pagehelper.PageInfo;
import com.zhiyou100.gym.pojo.Cab;
import com.zhiyou100.gym.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CabController {

    @Autowired
private CabService cabService;

    @GetMapping("cab")
    public String cab(String number, Model model, Integer pageIndex) {

        if (pageIndex == null) {
            pageIndex = 1;
        }
        if (number == null) {
            number = "";
        }
        PageInfo<Cab> info = cabService.queryAll(pageIndex, number);
        model.addAttribute("info", info.getList());
        System.out.println(info);
        model.addAttribute("pageIndex", info.getPageNum());
        model.addAttribute("number", number);
        model.addAttribute("pagesize", info.getPages());
        return "cab";
    }
}