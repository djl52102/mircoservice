package com.yonghui.irule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author djl
 * @date 2019/8/7 12:02
 */
@Configuration
public class ConfigBean {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
