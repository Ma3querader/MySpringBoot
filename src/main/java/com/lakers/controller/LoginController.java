package com.lakers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @Author: panyusheng
 * @Date: 2020/5/28 10:45
 * @Version 1.0
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        if (!StringUtils.isEmpty(username) && password.equals("123456")) {
            session.setAttribute("loginUser", username);
            return "redirect:/main";
        }
        return "login/login";
    }

}
