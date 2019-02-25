package com.zxf.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.zxf.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxf
 * @date 2019/1/21 14:40
 */
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo(){
        return echoService.echo("Hi Feign");
    }
}
