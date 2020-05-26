package com.lakers.configuration;

import com.lakers.bean.TestBean;
import org.springframework.context.annotation.*;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 14:25
 * @Version 1.0
 */
@Configuration
//@ComponentScan(basePackages = "com.lakers.bean")
@ImportResource("classpath:applicationContext-configuration.xml")
public class TestConfiguration {

//    @Bean
//    public TestBean testBean() {
//        return new TestBean();
//    }

    public TestConfiguration() {
        System.out.println("TestConfiguration容器初始化...");
    }

}
