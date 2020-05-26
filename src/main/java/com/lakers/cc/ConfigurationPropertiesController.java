package com.lakers.cc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 15:51
 * @Version 1.0
 */
@RestController
public class ConfigurationPropertiesController {

    @Autowired
    private HelloProperties helloProperties;

    @RequestMapping("/hello1")
    public Object getObjectProperties () {
        System.out.println(helloProperties.getMsg());
        return "fuck";
    }

}
