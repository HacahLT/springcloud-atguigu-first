package com.hacah.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hacah
 * @date 2022/7/5 16:51
 */
@Configuration
public class MyRibbonRule {

    @Bean("randomRule")
    public IRule getRule() {
        return new RandomRule();
    }

}
