package com.example.oembed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OembedApplication {

    public static void main(String[] args) {
        SpringApplication.run(OembedApplication.class, args);
    }

}
