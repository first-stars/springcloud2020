package com.w.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xin
 * @date 2022-09-27-11:00
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced   //赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
