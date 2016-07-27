package com.everseeker.spring.jersey.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by everseeker on 16/7/26.
 */
@Configuration
@ComponentScan(basePackages = {"com.everseeker.spring.jersey"})
@ImportResource({"classpath:mybatis-spring.xml"})
public class RootConfig {
}
