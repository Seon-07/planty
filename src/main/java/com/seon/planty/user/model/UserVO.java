package com.seon.planty.user.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {
	//사용자 ID
	private String id;
	//사용자 비밀번호
	private String pw;
	//사용자 이름
	private String name;
	//사용자 핸드폰 번호
	private String mobile;
	//사용자 주소
	private String addr;
	//사용자 생년월일 YYYY-MM-DD
	private LocalDate birth;
	//사용자 회원가입일
	private LocalDate signUpDate;
}
