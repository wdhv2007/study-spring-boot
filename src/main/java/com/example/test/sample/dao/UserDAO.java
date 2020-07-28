package com.example.test.sample.dao;

import java.util.List;
import java.util.Map;

import com.example.test.sample.vo.UserVO;


public interface UserDAO {
	public List<Map<String, Object>> selectUserList() throws Exception;
	
	public List<UserVO> selectUserVO() throws Exception;
}
