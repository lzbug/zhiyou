package com.zhiyou100.gym.controller;

import com.zhiyou.images.pojo.User;
import com.zhiyou.images.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login.do")
    public String login(Model model, User user){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(),user.getPassword());
        try {
            subject.login(token);
        } catch (Exception e) {
            e.printStackTrace();
            return "forward:/login.html";
        }
        return "redirect:/";
    }
}
