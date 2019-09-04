package com.zww.servicefeign.config;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign配置
 *
 * @author zhaoww
 * @since 2019/09/05
 */
@Configuration
public class FeignConfig {
    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    /**
     * 为FeignConfig添加链接eureka的权限
     *
     * @return
     */
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "123");
    }
}