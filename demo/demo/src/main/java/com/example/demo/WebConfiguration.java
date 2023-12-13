package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@org.springframework.context.annotation.Configuration
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Bean
    public FilterRegistrationBean filterBean(){

        logger.info("::: WebConfiguration :::");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new apiFilter());
        registrationBean.setOrder(Integer.MIN_VALUE);
        return registrationBean;
    }
}
