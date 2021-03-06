package com.example.shitwishzuul.shitwishzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;
@Configuration
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ShitwishZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShitwishZuulApplication.class, args);
    }

}

