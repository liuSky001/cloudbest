package com.cloudbest.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author lmx
 */
@Slf4j
@RestController
public class FeignProviderController {


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/provider/find")
    public String findFeignTest(){
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            log.info("接口异常：{}",e.getMessage());
//        }
        return "Feign调用服务测试成功," + "端口号为: " + serverPort;
    }

    @PostMapping("/provider/add")
    public String addFeignTest(@RequestBody String jsonStr){
        log.info("{}",jsonStr);
        return "Feign调用服务测试成功," + jsonStr + "端口号为: " + serverPort;
    }
}
