package com.yonghui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author djl
 * @date 2019/8/6 14:06
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DeptConsumer80_Feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign.class,args);
    }
}
