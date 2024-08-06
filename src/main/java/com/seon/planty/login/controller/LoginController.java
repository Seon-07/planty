package com.seon.planty.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	//로그인페이지 이동
	@GetMapping
	public String loginPage(){
		return "/login/login";
	}
	
}
