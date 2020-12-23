package com.cheerhou.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/23
 */
@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public  LimitsConfiguration retrieveLimitsFromConfiguration() {
        return new LimitsConfiguration(1000, 1);
    }
}
