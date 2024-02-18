package com.zc.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JDBCConfig.class, MybatisConfig.class})
public class SpringConfig {

}
