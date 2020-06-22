package com.szq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class HouseApp {

    public static void main(String[] args) {
        SpringApplication.run(HouseApp.class,args);
    }
}
