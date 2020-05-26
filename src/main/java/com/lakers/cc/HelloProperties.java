package com.lakers.cc;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 15:48
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "service.properties")
public class HelloProperties {

    private static final String SERVICE_NAME = "test-service";

    private String msg = SERVICE_NAME;

    public static String getServiceName() {
        return SERVICE_NAME;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
