package kh.com.spring07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	//회원가입 페이지
	@RequestMapping("/join")
	public String join() {
		return "member/join";
	}
	
	//로그인 페이지
	@RequestMapping("/login")
	public String login() {
		return "member/login";
	}
}
