package com.lakers.cc;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 17:35
 * @Version 1.0
 */
public class Hello {

    private String msg;

    public String sayHello() {
        return "hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
