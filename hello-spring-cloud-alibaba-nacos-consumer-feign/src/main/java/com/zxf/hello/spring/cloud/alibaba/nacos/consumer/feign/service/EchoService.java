package com.zxf.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.zxf.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zxf
 * @date 2019/1/21 14:39
 */
@Service
@FeignClient(value = "nacos-provider", fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable("message") String message);
}
