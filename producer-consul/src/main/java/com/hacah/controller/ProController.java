package com.hacah.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hacah
 * @date 2022/7/3 20:02
 */
@RestController
public class ProController {

    @RequestMapping("/producer/consul")
    public String pro() {
        return "生产者提供的数据";
    }
}
