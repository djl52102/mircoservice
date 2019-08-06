package com.yonghui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author djl
 * @date 2019/8/6 14:55
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_app {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_app.class,args);
    }
}