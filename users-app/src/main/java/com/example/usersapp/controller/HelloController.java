package com.example.usersapp.controller;

import com.example.usersapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZZH
 * @date 2019/8/9 16:41
 */
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/user")
    private String index(){
        List<ServiceInstance> list = client.getInstances("users-service");
        if(list != null && list.size() > 0){
            return list.get(0).getUri().toString();
        }
        return "Hello World";
    }

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "user-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

}
