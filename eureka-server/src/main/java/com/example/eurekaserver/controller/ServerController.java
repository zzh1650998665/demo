package com.example.eurekaserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZZH
 * @date 2019/8/10 10:31
 */
@RestController
public class ServerController {

    @RequestMapping(value = "/server",method = RequestMethod.GET)
    public String restTemplate(){
        return "这是服务器的东西啊！！！";
    }

    public void update(){

    }

}
