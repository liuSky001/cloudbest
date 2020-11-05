package com.cloudbest.gateway.filter;

import io.netty.util.internal.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @version 1.0
 * @Author lmx
 */
//@Slf4j
//@Component
public class TokenGlobalFilter
       // implements Ordered, GlobalFilter
{

//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//
//        HttpHeaders httpHeaders = exchange.getRequest().getHeaders();
//        String token = httpHeaders.getFirst("authToken");
//        if (StringUtil.isNullOrEmpty(token)) {
//            //当请求不携带Token或者token为空时，直接设置请求状态码为401，返回
//            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//            return exchange.getResponse().setComplete();
//        }
//        return chain.filter(exchange);
//    }
//
//    public int getOrder() {
//        return 0;
//    }
}
