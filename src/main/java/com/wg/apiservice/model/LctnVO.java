package com.wg.apiservice.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "À§Ä¡")
public class LctnVO {
	private String fclty_id;
	private String lctn_cd;
	private float file_id;
	private String lctn_nm;
	private float lat;
	private float lot;
	private String now_opratn_yn;
	private String use_yn;
	private String del_yn;
	private String reg_dt;
	private String reg_id;
	private String mdfcn_id;
	
	public String getFclty_id() {
		return fclty_id;
	}
	public void setFclty_id(String fclty_id) {
		this.fclty_id = fclty_id;
	}
	public String getLctn_cd() {
		return lctn_cd;
	}
	public void setLctn_cd(String lctn_cd) {
		this.lctn_cd = lctn_cd;
	}
	public float getFile_id() {
		return file_id;
	}
	public void setFile_id(float file_id) {
		this.file_id = file_id;
	}
	public String getLctn_nm() {
		return lctn_nm;
	}
	public void setLctn_nm(String lctn_nm) {
		this.lctn_nm = lctn_nm;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLot() {
		return lot;
	}
	public void setLot(float lot) {
		this.lot = lot;
	}
	public String getNow_opratn_yn() {
		return now_opratn_yn;
	}
	public void setNow_opratn_yn(String now_opratn_yn) {
		this.now_opratn_yn = now_opratn_yn;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	public String getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getMdfcn_id() {
		return mdfcn_id;
	}
	public void setMdfcn_id(String mdfcn_id) {
		this.mdfcn_id = mdfcn_id;
	}
	
	
	
}
