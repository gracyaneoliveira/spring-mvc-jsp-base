package com.produto.wine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.produto.wine.controller.VinhosController;

@Configuration
@ComponentScan (basePackageClasses = {VinhosController.class})
@EnableWebMvc
public class WebConfig {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");	
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
