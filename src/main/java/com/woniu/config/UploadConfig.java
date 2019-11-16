package com.woniu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
@Configuration
public class UploadConfig {
	@Bean
    public CommonsMultipartResolver multiparResolver() {
    	CommonsMultipartResolver resolver = new CommonsMultipartResolver();
    	return resolver;
    }
}
