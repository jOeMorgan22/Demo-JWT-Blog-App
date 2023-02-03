package com.jmorg.demojwtblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.jmorg.demojwtblog.config.RSAKeyProperties;

@EnableConfigurationProperties(RSAKeyProperties.class)
@SpringBootApplication
public class DemoJwtBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJwtBlogApplication.class, args);
	}

}
 