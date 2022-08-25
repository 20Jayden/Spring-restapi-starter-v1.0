package com.example.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.restapi.service.RestApiService;
import com.example.restapi.vo.UserVO;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping(value="/api")
public class RestApiController {
	
	@Autowired
	private RestApiService service;
	
	
	@Operation(summary = "유저정보 조회(전체)")
	@GetMapping("")
	public List<UserVO> selectAllUser() throws Exception{
		return service.selectAllUser();
	}
	
	@Operation(summary = "유저정보 조회")
	@GetMapping("/{user_id}")
	public List<UserVO> selectUser(@PathVariable("user_id") String user_id) throws Exception{
		return service.selectUser(user_id);
	}
	
	@Operation(summary = "유저정보 등록")
	@PostMapping("")
	public List<UserVO> insertUser(@RequestBody UserVO vo) throws Exception{
		service.insertUser(vo);
		return service.selectUser((String) vo.getUser_id());
	}
	
	@Operation(summary = "유저정보 수정")
	@PutMapping("/{user_id}")
	public List<UserVO> updateUser(@PathVariable String user_id, @RequestBody UserVO vo) throws Exception{
		service.updateUser(user_id, vo);
		return service.selectUser(user_id);
	}
	
	@Operation(summary = "유저정보 삭제")
	@DeleteMapping("/{user_id}")
	public List<UserVO> deleteUser(@PathVariable String user_id) throws Exception{
		service.deleteUser(user_id);
		return service.selectUser(user_id);
	}
	
}
