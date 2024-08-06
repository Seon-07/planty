package com.seon.planty.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/login")
public class LoginRestController {
	//로그인
	@PostMapping
	public String login(){ //ajax로 바꾸
		return "/login/login";
	}
	
}
