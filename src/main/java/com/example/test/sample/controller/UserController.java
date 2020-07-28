package com.example.test.sample.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.sample.service.UserService;
import com.example.test.sample.vo.UserVO;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public List<UserVO> mainMethod() throws Exception {
		//return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		//return testService.getUserList().toString();
		return userService.getUserVO();
	}
}
