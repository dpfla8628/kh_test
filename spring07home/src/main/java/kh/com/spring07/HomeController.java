package kh.com.spring07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//메인 페이지
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}
