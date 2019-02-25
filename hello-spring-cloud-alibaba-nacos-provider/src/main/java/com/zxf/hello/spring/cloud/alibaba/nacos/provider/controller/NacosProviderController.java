package com.zxf.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxf
 * @date 2019/1/18 16:15
 */
@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    // 注入配置的上下文
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message") String message) {
        return "Hello Nacos Discovery " + message + ", i am from port " + port;
    }

    @GetMapping(value = "/hi")
    public String sayHi(){
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }
}
