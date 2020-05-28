package com.lakers.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: panyusheng
 * @Date: 2020/5/28 15:12
 * @Version 1.0
 */
@Configuration
public class MyMvcConfiguration implements WebMvcConfigurer {


//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("fine/hello").setViewName("fine");
//    }
}
