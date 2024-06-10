package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome To SBI Bank....";
	}
	
	@GetMapping("/transfer")
	public String fund() {
		
		return "Fund Transferred Succcessfully";
	}
	
	@GetMapping("/balance")
	public String checkBalance() {
		
		return "Remaining Balance in your Account is : $10000";
	}
	
	@GetMapping("/about")
	public String aboutus() {
		
		return "SBI Bank is Managed By Indian Goverment";
	}
}
