package com.cloudbest.cloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProviderFeignApi {

    @GetMapping("/provider/find")
    public String findFeignTest();

    @PostMapping("/provider/add")
    public String addFeignTest(@RequestBody String jsonStr);

}
