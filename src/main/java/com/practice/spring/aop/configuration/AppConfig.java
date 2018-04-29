package com.practice.spring.aop.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.practice.spring")
public class AppConfig {
	
	// This is class describe about the configuration class ie without writing the xml file

}
