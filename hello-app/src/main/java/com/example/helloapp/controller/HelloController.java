package com.example.helloapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ZZH
 * @date 2019/8/9 16:41
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/hello")
    private String index(){
        List<ServiceInstance> list = client.getInstances("hello-service");
        if(list != null && list.size() > 0){
            return list.get(0).getUri().toString();
        }
        return "Hello World";
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello1")
    public String restTemplate(){
        return restTemplate.getForObject("http://localhost:8081/server",String.class);
    }

}
