package com.cheerhou.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/23
 */
@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;


    @GetMapping("/limits")
    public  LimitsConfiguration retrieveLimitsFromConfiguration() {
        return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
