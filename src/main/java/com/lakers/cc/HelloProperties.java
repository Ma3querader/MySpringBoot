package com.lakers.cc;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 15:48
 * @Version 1.0
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private static final String MSG = "world";

    private String msg = MSG ;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
