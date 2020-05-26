package com.lakers.test;

import com.lakers.bean.TestBean;
import com.lakers.configuration.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 14:26
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfiguration.class);
        TestBean testBean = (TestBean) ac.getBean("testBean");
        testBean.sayHello();
    }

}
