package com.lakers;

import com.lakers.bean.ConnectionSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyspringbootApplication {

    public ConnectionSettings getConnectionSettings() {
        return new ConnectionSettings();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }

}
