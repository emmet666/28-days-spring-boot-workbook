package com.example.demo3.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zejun.shu
 * @class WebFilterConfig
 * @date 2019-06-27
 **/
@Configuration
public class WebFilterConfig {
	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter1());
		registration.addUrlPatterns("/*");
		registration.setName("MyFilter1");
		registration.setOrder(6);
		return registration;
	}

	@Bean
	public FilterRegistrationBean test2FilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter2());
		registration.addUrlPatterns("/*");
		registration.setName("MyFilter2");
		registration.setOrder(1);
		return registration;
	}
}
