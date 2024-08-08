package com.seon.planty.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.seon.planty.login.model.LoginVO;
import com.seon.planty.user.model.UserVO;

@Mapper
public interface LoginMapper {
	UserVO getUser(LoginVO loginVO);
}
