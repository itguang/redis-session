package com.itguang.redissession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSessionApplication.class, args);
	}
}
