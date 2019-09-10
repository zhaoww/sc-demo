package com.zww.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoww
 * @since 2019/09/10
 */
@RefreshScope
@RestController
public class HelloController {

    @Value("${config.hello}")
    private String configHello;

    @GetMapping("/hello")
    public String hello() {
        return configHello;
    }
}
