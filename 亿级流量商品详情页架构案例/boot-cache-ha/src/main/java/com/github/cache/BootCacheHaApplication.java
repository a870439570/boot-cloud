package com.github.cache;
import com.github.cache.filter.HystrixRequestContextFilter;
<<<<<<< HEAD
import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
>>>>>>> 2c2c2bdfa9b80e3a50c462378e3c72473beea707
import org.springframework.context.annotation.Bean;


/**
 * 功能描述:  基于hystrix的高可用缓存服务架构
 * @author: qinxuewu
 * @date: 2019/11/12 11:29
 * @since 1.0.0 
 */
@SpringBootApplication
public class BootCacheHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCacheHaApplication.class, args);
	}


	/**
	 * hystrix请求上下文过滤器
	 * @return
	 */
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new HystrixRequestContextFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}
<<<<<<< HEAD

	@Bean
	public ServletRegistrationBean indexServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
		registration.addUrlMappings("/hystrix.stream");
		return registration;
	}
=======
>>>>>>> 2c2c2bdfa9b80e3a50c462378e3c72473beea707
}
