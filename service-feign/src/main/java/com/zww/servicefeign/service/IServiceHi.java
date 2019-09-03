package com.zww.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign消费者接口
 *
 * @author zhaoww
 * @since 2019/09/03
 */
@FeignClient(value = "eureka-provider")
public interface IServiceHi {

    /**
     * 对应eureka-provider 接口 url
     *
     * @return str
     */
    @GetMapping(value = "/eureka-provider/test/test")
    String sayHi();
}
