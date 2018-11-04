package com.sly.springboot.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//
//        super.addViewControllers(registry);
        registry.addViewController("abc").setViewName("success");
    }
}
