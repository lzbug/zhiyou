package com.zhiyou100.gym.controller;

import com.zhiyou100.gym.pojo.Sign;
import com.zhiyou100.gym.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@Controller
@RequestMapping("sign")
public class SignController {
    @Autowired
    private SignService signService;

//    @GetMapping("sign")
//    public List<Sign> queryAll(){
//        return  signService.queryAll();
//    }

    @GetMapping("sign")
    public String show(Model model){
        model.addAttribute("sign",signService.queryAll());
        return "sign/show";
    }

}
