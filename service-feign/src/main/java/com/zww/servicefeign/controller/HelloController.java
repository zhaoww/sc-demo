package com.zww.servicefeign.controller;

import com.zww.servicefeign.service.IServiceHi;
import com.zww.servicefeign.service.ITestHystrixService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @Resource
    private ITestHystrixService testHystrixService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return serviceHi.sayHi();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() throws Exception {
        return testHystrixService.getInfo();
    }
}
