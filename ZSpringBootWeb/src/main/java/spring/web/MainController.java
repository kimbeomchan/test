package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * Welcome Page  : �������� ����� Controller �� ����.
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
		
		System.out.println("[ MainController.index() start........]");//<== ������
		//==> web.xml : <welcome-file>~~~.html or ~~.jsp</welcome-fle> : �������� �����̾�� ��.
		return "/user/logon.jsp";
		
	}
}


