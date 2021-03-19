package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//스프링 부트의 가장 기본적인 설정을 선언
//@Configuration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
public class JspboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspboardApplication.class, args);
	}

}
