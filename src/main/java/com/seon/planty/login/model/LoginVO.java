package com.seon.planty.login.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginVO {
	
	//로그인 시 아이디
	private String id;
	
	//로그인 시 비밀번호
	private String pw;
}
