package com.cloudbest.cloud.service;

import com.cloudbest.cloud.feign.ProviderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.jar.JarEntry;

@Service
public class ProviderFeignServiceImpl {

    @Autowired
    private ProviderFeignService feignService;

      public String findFeignTest(){
          String str = feignService.findFeignTest();
          return str;
      }

    public String addFeignTest(String jsonStr){
        String str = feignService.addFeignTest(jsonStr);
        return str;
    }
}
