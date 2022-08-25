package com.example.restapi.service;

import java.util.List;

import com.example.restapi.vo.UserVO;

public interface RestApiService {
	
	public List<UserVO> selectAllUser() throws Exception;
	
	public List<UserVO> selectUser(String user_id) throws Exception;
	
	public int insertUser(UserVO vo) throws Exception;
	
	public int updateUser(String user_id, UserVO vo) throws Exception;
	
	public int deleteUser(String user_id) throws Exception;
}
