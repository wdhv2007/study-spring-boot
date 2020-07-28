package com.example.test.sample.service;

import java.util.List;
import java.util.Map;

import com.example.test.sample.vo.UserVO;


public interface UserService {
	public List<Map<String, Object>> getUserList() throws Exception;
	
	public List<UserVO> getUserVO() throws Exception;
}
