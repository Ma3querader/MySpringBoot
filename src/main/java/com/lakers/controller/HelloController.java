package com.lakers.controller;

import com.lakers.bean.ConnectionSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 13:49
 * @Version 1.0
 */

@RestController
public class HelloController {

    @Autowired
    private ConnectionSettings conn;

    @RequestMapping("/hello")
    public String hello() {
        String s = conn.toString();
        System.out.println(s);
        return "fuck";
    }

}
