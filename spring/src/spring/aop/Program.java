package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {
	public static void main(String[] args) {
		
		ApplicationContext context 
		= new ClassPathXmlApplicationContext("spring/aop/setting.xml");
	//= new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		Exam proxy = (Exam) context.getBean("proxy");
		System.out.println(proxy.total());
	}
}
