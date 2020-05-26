package com.lakers.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: panyusheng
 * @Date: 2020/5/26 13:48
 * @Version 1.0
 */
@Component
@ConfigurationProperties(prefix = "connection")
public class ConnectionSettings {
    private String username;
    private String remoteAddress;
    private String password ;

    @Override
    public String toString() {
        return "ConnectionSettings{" +
                "username='" + username + '\'' +
                ", remoteAddress='" + remoteAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
