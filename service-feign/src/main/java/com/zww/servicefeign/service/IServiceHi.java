package com.zww.servicefeign.service;

import com.zww.servicefeign.config.FeignConfig;
import com.zww.servicefeign.service.impl.ServiceHiFallback;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Feign消费者接口
 *
 * @author zhaoww
 * @since 2019/09/03
 */
@FeignClient(value = "eureka-provider", configuration = FeignConfig.class, fallback = ServiceHiFallback.class)
//@RequestMapping("/eureka-provider")
public interface IServiceHi {

    /**
     * 对应eureka-provider 接口 url
     *
     * @return str
     */
//    @GetMapping(value = "/eureka-provider/test/test")
//    @RequestMapping(value = "/eureka-provider/test/test", method = RequestMethod.GET)
    @RequestLine("GET /eureka-provider/test/test")
    String sayHi();
}
