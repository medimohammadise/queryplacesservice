package com.jimdo.queryplace.queryplaceservice;

import com.jimdo.queryplace.queryplaceservice.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({ApplicationProperties.class})
@SpringBootApplication
public class QueryplaceserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueryplaceserviceApplication.class, args);
	}
}
