package com.zww.servicefeign.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zww.servicefeign.service.ITestHystrixService;
import org.springframework.stereotype.Service;

/**
 * @author zhaoww
 * @since 2019/09/05
 */
@Service
public class TestHystrixServiceImpl implements ITestHystrixService {
    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public String getInfo() throws Exception {
        int a = 1 / 0;
        return "info";
    }

    /**
     * fallback
     *
     * @param e
     * @return
     */
    public String fallback(Throwable e) {
        e.printStackTrace();
        return "fallback";
    }
}
