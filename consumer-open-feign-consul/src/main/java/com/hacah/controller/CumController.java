package com.hacah.controller;

import com.hacah.feignServer.ProducerFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hacah
 * @date 2022/7/3 20:22
 */
@Slf4j
@RestController
public class CumController {

    @Autowired
    private ProducerFeign producerFeign;

    @GetMapping("consumer/consul/{id}")
    public String consumeString(@PathVariable("id") String id) {
        String result = producerFeign.pro(id);
        return result;
    }


}
