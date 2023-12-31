package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * Welcome Page  : 여러가지 방법중 Controller 로 만듬.
 */
@Controller
public class MainController {
	
	///Constructor
	public MainController(){
		System.out.println("==> MainController default Constructor call.............");
	}

	@GetMapping("/")
	@PostMapping
	public String index() {
		
		System.out.println("[ MainController.index() start........]");//<== 디버깅용
		//==> web.xml : <welcome-file>~~~.html or ~~.jsp</welcome-fle> : 물리적인 파일이어야 함.
		return "/user/logon.jsp";
		
	}
}


