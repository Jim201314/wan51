package com.wan51.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author CRGT
 */
@SpringBootApplication
@MapperScan("com.wan51.provider.dao.test.mapper")
public class ServletInitializerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletInitializerApplication.class, args);
	}
}
