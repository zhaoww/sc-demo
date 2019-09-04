package com.zww.servicefeign.service;

import com.zww.servicefeign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign消费者接口
 *
 * @author zhaoww
 * @since 2019/09/03
 */
@FeignClient(value = "eureka-provider", configuration = FeignConfig.class)
@RequestMapping("/eureka-provider")
public interface IServiceHi {

    /**
     * 对应eureka-provider 接口 url
     *
     * @return str
     */
//    @GetMapping(value = "/test/test")
    @RequestMapping(value = "/test/test", method = RequestMethod.GET)
//    @RequestLine("GET /test/test")
    String sayHi();
}
