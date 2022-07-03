package com.hacah.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Hacah
 * @date 2022/7/3 20:22
 */
@Slf4j
@RestController
public class CumController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("consumer/consul")
    public String consumeString() {
        String url = getUrl("consul-producer", "producer/consul");
        String result = restTemplate.getForObject(url, String.class);
        log.info("请求结果是：{}", result);
        return result;
    }

    public String getUrl(String serviceId, String uri) {
        ServiceInstance instance = loadBalancerClient.choose(serviceId);
        String s = String.format("http://%s:%s/%s", serviceId, instance.getPort(), uri);
        log.info("url为{}", s);
        return s;

    }


}
