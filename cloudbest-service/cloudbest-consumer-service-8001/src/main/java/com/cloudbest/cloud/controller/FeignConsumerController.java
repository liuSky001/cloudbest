package com.cloudbest.cloud.controller;

import com.cloudbest.cloud.service.ProviderFeignServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    private ProviderFeignServiceImpl feignService;


    @GetMapping("/consumer/find")
    public String getConsumer(){
        return feignService.findFeignTest();
    }

    @PostMapping("/consumer/add")
    public String addConsumer(@RequestBody String jsonStr){
        return feignService.addFeignTest(jsonStr);
    }
}
