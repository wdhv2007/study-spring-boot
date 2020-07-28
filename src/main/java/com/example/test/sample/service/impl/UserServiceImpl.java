package com.example.test.sample.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.test.sample.dao.UserDAO;
import com.example.test.sample.service.UserService;
import com.example.test.sample.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDAO userDAO;
	
	@Override
	public List<Map<String, Object>> getUserList() throws Exception {
		return userDAO.selectUserList();
	}

	@Override
	public List<UserVO> getUserVO() throws Exception {
		return userDAO.selectUserVO();
	}

}
