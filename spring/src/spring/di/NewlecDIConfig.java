package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDIConfig {
	
	@Bean 
	//bean으로서 컨테이너를 통해 spring으로 저장
	public Exam exam() {
		return new NewlecExam();
	}
}
