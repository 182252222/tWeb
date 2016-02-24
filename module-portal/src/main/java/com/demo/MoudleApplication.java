/**
 * 
 */
package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author create by hibeary@126.com on 2016年2月19日下午5:27:29
 *
 */
@Configuration
@ComponentScan(basePackages = "com.demo")
@EnableAutoConfiguration
@SpringBootApplication
public class MoudleApplication extends SpringBootServletInitializer{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MoudleApplication.class, args);
	}

}
