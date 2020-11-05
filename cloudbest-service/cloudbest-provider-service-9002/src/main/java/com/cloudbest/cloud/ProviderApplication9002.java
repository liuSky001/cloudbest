package com.cloudbest.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author lmx
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProviderApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication9002.class,args);
    }
}
