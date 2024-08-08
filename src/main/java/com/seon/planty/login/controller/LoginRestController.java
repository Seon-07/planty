package com.seon.planty.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seon.planty.common.model.ResponseData;
import com.seon.planty.login.model.LoginVO;
import com.seon.planty.login.service.LoginService;
import com.seon.planty.user.model.UserVO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/api/login")
public class LoginRestController {
	
	private LoginService loginService;
	//로그인
	@PostMapping
	public ResponseEntity<ResponseData<UserVO>> login(@RequestBody LoginVO loginVO, HttpSession session){
		ResponseData<UserVO> response = new ResponseData<>();
		UserVO userVO = loginService.login(loginVO);
		if(userVO != null) {
			response = new ResponseData<>("success", "로그인 성공", userVO);
		}else {
			response = new ResponseData<>("failure", "로그인 실패");
		}
		return ResponseEntity.ok(response);
	}
	
}
