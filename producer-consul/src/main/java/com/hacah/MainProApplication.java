package com.hacah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Hacah
 * @date 2022/7/3 19:59
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainProApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainProApplication.class, args);
    }
}
