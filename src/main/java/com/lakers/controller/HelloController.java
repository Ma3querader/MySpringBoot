package com.lakers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 13:49
 * @Version 1.0
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "fuck";
    }

}
