package com.zxf.hello.spring.cloud.alibaba.nacos.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zxf
 * @date 2019/1/21 11:06
 */
@Configuration
public class NacosConsumerConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
