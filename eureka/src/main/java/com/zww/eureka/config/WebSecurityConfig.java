package com.zww.eureka.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 配置类 https://segmentfault.com/a/1190000015319949
 *
 * @author zhaoww
 * @since 2019/09/02
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 新版（Spring Cloud 2.0 以上）的security默认启用了csrf检验
        // 覆盖父类的 configure(HttpSecurity http) 方法，关闭掉 csrf
        http.csrf().disable();
        super.configure(http);
    }
}
