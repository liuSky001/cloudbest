package com.cloudbest.cloud.feign;

import org.springframework.stereotype.Component;

/**
 * @Author lmx
 */
@Component
public class ProviderFeignHystrixServiceImpl implements ProviderFeignService {


    public String findFeignTest() {
        return "服务器异常,接口调用失败,请稍后重试";
    }


    public String addFeignTest(String jsonStr) {
        return  "服务器异常,接口调用失败,请稍后重试";
    }
}
