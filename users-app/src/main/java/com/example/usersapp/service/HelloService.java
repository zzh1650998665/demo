package com.example.usersapp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZZH
 * @date 2019/8/10 14:41
 */
@FeignClient("hello-service")
@Service
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
}
