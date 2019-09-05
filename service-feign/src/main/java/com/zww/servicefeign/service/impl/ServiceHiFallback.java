package com.zww.servicefeign.service.impl;

import com.zww.servicefeign.service.IServiceHi;
import org.springframework.stereotype.Service;

/**
 * Hystrix
 *
 * @author zhaoww
 * @since 2019/09/05
 */
@Service
public class ServiceHiFallback implements IServiceHi {
    @Override
    public String sayHi() {
        return "fallback hi";
    }
}
