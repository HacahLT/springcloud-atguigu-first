package com.hacah.feignServer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hacah
 * @date 2022/7/5 19:16
 */
@FeignClient("consul-producer")
public interface ProducerFeign {

    /**
     * 对生产者接口定义
     *
     * @return
     */
    @RequestMapping("/producer/consul/{id}")
    public String pro(@PathVariable("id") String id);

}
