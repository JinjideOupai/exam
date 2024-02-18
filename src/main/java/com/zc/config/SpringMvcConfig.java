package com.zc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.zc")
@EnableWebMvc
public class SpringMvcConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver re = new InternalResourceViewResolver();
        re.setSuffix(".html");
        re.setPrefix("/pages/");
        return re;
    }
}
