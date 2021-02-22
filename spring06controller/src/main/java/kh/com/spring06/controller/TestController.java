package kh.com.spring06.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * 자바의 고질적인 문제점
 * 뭐만 만들려고 하면 상속을 받아야 한다
 * 빠르게 완성해서 편하다는 점은 있지만 자유도가 떨어지고 쓸데없는 코드가 많이 생긴다
 * 요청을 처리해야하는 상황은 여러가지인데 
 * implements Controller 대신 @Controller를 사용하자! <- component-scan!
 * 메타 프로그래밍(cf:해시태그)
 */
@Controller
public class TestController{
	/*
	 * /first를 처리할 수 있는 메소드 구현
	 */
	public ModelAndView first(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/WEB-INF/views/first.jsp");
		return mv;
	}
	/*
	 * /second를 처리할 수 있는 메소드 구현
	 */
	@RequestMapping("/second")
	public String second() {
		return "/WEB-INF/views/second.jsp";
	}
	
	/*
	 * /third를 처리할 수 있는 메소드 구현
	 */
	@RequestMapping("/third")
	public String third(Model model) {
		Random r = new Random();
		int dice = r.nextInt(6)+1;
		model.addAttribute("dice",dice);
		return "/WEB-INF/views/third.jsp";
	}
	
}
