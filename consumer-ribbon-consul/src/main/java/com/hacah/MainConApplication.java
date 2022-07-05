package com.hacah;

import com.hacah.config.MyRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Hacah
 * @date 2022/7/3 20:14
 */
@EnableDiscoveryClient
@SpringBootApplication
// 指定负载策略
@RibbonClient(name = "consul-producer", configuration = MyRibbonRule.class)
public class MainConApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainConApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
