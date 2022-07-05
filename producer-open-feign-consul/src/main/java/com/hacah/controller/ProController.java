package com.hacah.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hacah
 * @date 2022/7/3 20:02
 */
@RestController
public class ProController {

    @RequestMapping("/producer/consul/{id}")
    public String pro(@PathVariable("id") String id) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "生产者提供的数据,我的id是：" + id;
    }
}
