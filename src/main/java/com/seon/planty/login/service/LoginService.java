package com.seon.planty.login.service;

import org.springframework.stereotype.Service;

import com.seon.planty.login.mapper.LoginMapper;
import com.seon.planty.login.model.LoginVO;
import com.seon.planty.user.model.UserVO;

@Service
public class LoginService {
	
	private LoginMapper loginMapper;
	
	//로그인
	public UserVO login(LoginVO loginVO) {
		return loginMapper.getUser(loginVO);
	}
}
