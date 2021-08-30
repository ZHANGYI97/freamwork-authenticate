package com.zz.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class FreamworkAuthenticateApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreamworkAuthenticateApplication.class, args);
    }

}
