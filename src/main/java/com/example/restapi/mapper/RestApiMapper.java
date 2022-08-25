package com.example.restapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.restapi.vo.UserVO;

@Mapper
public interface RestApiMapper {
	
	public List<UserVO> selectAllUser() throws Exception;
	
	public List<UserVO> selectUser(String user_id) throws Exception;
	
	public List<UserVO> insertUser(UserVO vo) throws Exception;
	
	public List<UserVO> updateUser(UserVO vo) throws Exception;
	
	public List<UserVO> deleteUser(String user_id) throws Exception;
	
}
