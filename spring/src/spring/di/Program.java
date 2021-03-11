package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 작성
		Exam exam = new NewlecExam();
		
		ExamConsole console = new InlineExamConsole(exam); //exam을 조립하는 DI과정
		//ExamConsole console = new GridExamConsole(exam);
		//이 두가지를 따로 만드는게 아니라 자유롭게 바꿔 끼우려면 ? spring을 이용해서 해보자
		
		console.setExam(exam);
		*/
		
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		//= new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam e : exams)
		//	System.out.println(e);
	}
}
