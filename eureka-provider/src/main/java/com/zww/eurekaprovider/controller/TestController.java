package com.zww.eurekaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author zhaoww
 * @since 2019/09/02
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "first api";
    }
}
