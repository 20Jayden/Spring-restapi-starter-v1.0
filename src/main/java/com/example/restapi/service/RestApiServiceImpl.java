package com.example.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.mapper.RestApiMapper;
import com.example.restapi.vo.UserVO;

@Service
public class RestApiServiceImpl implements RestApiService{
	
	@Autowired
	private RestApiMapper apiMapper;
	
	public List<UserVO> selectAllUser() throws Exception{
		return apiMapper.selectAllUser();
	}
	
	public List<UserVO> selectUser(String user_id) throws Exception{
		return apiMapper.selectUser(user_id);
	}
	
	public int insertUser(UserVO vo) throws Exception{
		return apiMapper.insertUser(vo);
	}
	
	public int updateUser(String user_id, UserVO vo) throws Exception{
		return apiMapper.updateUser(vo);
	}
	
	public int deleteUser(String user_id) throws Exception{
		return apiMapper.deleteUser(user_id);
	}
}
