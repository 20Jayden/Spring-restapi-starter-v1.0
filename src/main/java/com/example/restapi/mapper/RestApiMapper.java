package com.example.restapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.restapi.vo.UserVO;

@Mapper
public interface RestApiMapper {
	
	public List<UserVO> selectAllUser() throws Exception;
	
	public List<UserVO> selectUser(String user_id) throws Exception;
	
	public int insertUser(UserVO vo) throws Exception;
	
	public int updateUser(UserVO vo) throws Exception;
	
	public int deleteUser(String user_id) throws Exception;
	
}
