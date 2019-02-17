 package com.ly.mobilelibrary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({ "com.ly.mobilelibrary.base.*"})
public class MobileLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileLibraryApplication.class, args);
	}

}

