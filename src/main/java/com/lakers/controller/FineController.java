package com.lakers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: panyusheng
 * @Date: 2020/5/28 10:45
 * @Version 1.0
 */
@Controller
@RequestMapping("/fine")
public class FineController {

    @RequestMapping("/hello")
    public String getFineHtml() {
        return "fine";
    }

}
