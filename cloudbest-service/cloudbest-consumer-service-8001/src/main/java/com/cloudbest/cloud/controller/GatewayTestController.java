package com.cloudbest.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @Author lmx
 */
@RestController
public class GatewayTestController {



    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/im/get/{id}")
    public String getTest(@PathVariable("id") Integer id){
        return "网关服务转发成功，端口号为：" + serverPort + " : " + id;
    }

    @PostMapping("/im/post")
    public String getTest(@RequestBody String str){
        return "网关服务转发成功，端口号为：" + serverPort + " : " + str;
    }


}
