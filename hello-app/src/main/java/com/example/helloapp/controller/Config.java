package com.example.helloapp.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZZH
 * @date 2019/8/10 14:29
 */
@Configuration
public class Config {
    @Bean
    @LoadBalanced
    public RestTemplate GetRestTemplate(){
        return new RestTemplate();
    }
}
