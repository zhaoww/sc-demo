package com.zww.servicefeign.controller;

import com.zww.servicefeign.service.IServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * hello
 *
 * @author zhaoww
 * @since 2019/09/03
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Resource
    private IServiceHi serviceHi;

    @GetMapping("/hello")
    public String hello() {
        return serviceHi.sayHi();
    }
}
