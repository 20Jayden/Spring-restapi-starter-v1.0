package com.example.restapi.vo;

import io.swagger.v3.oas.annotations.media.Schema;

public class UserVO {
	
	@Schema(description = "유저ID", example = "kim1234")
	private String user_id;
	
	@Schema(description = "유저이름", example = "kim")
	private String user_nm;
	
	@Schema(description = "이메일", example = "kim1234@gmail.com")
	private String email;
	
	@Schema(description = "생성날짜", example = "YYYY-MM-DD")
	private String reg_dt;
	
	@Schema(description = "수정날짜", example = "YYYY-MM-DD")
	private String updt_dt;

	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}

	public String getUpdt_dt() {
		return updt_dt;
	}

	public void setUpdt_dt(String updt_dt) {
		this.updt_dt = updt_dt;
	}
	
	
}
