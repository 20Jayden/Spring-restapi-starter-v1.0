package com.wg.apiservice.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "½Ã¼³¹°")
public class FcltsVO {
	private float fclts_seq;
	private String fclty_id;
	private String lctn_cd;
	private float file_id;
	private float std_job_id;
	private String fclts_cd;
	private String fclts_nm;
	private String model_nm;
	private String up_eqpmn_id;
	private String makr;
	private String instl_dt;
	private String cnstrct_entrps;
	private String cnstrtr;
	private String bsns_info;
	private String fclts_seq_no;
	private String fclts_pic;
	private String use_imprty_yn;
	private String mntrng_yn;
	private String fclts_stts;
	private String alarm_mntrg_exc_yn;
	private String now_alarm_stts;
	private String now_alarm_stts_crtr_dt;
	private String trobl_dt;
	private float lat;
	private float lot;
	private String cycle_tmunit;
	private int save_cycle;
	private int anal_cycle;
	private int clct_cycle;
	private int exprs_cycle;
	private int reclct_cycle;
	private String rm;
	private String use_yn;
	private String del_yn;
	private String recnt_prcs_dt;
	private String reg_id;
	private String mdfcn_id;
	private String anls_cycle;
	private int reprsnt_img_file_id;
	
	public float getFclts_seq() {
		return fclts_seq;
	}
	public void setFclts_seq(float fclts_seq) {
		this.fclts_seq = fclts_seq;
	}
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
	public float getStd_job_id() {
		return std_job_id;
	}
	public void setStd_job_id(float std_job_id) {
		this.std_job_id = std_job_id;
	}
	public String getFclts_cd() {
		return fclts_cd;
	}
	public void setFclts_cd(String fclts_cd) {
		this.fclts_cd = fclts_cd;
	}
	public String getFclts_nm() {
		return fclts_nm;
	}
	public void setFclts_nm(String fclts_nm) {
		this.fclts_nm = fclts_nm;
	}
	public String getModel_nm() {
		return model_nm;
	}
	public void setModel_nm(String model_nm) {
		this.model_nm = model_nm;
	}
	public String getUp_eqpmn_id() {
		return up_eqpmn_id;
	}
	public void setUp_eqpmn_id(String up_eqpmn_id) {
		this.up_eqpmn_id = up_eqpmn_id;
	}
	public String getMakr() {
		return makr;
	}
	public void setMakr(String makr) {
		this.makr = makr;
	}
	public String getInstl_dt() {
		return instl_dt;
	}
	public void setInstl_dt(String instl_dt) {
		this.instl_dt = instl_dt;
	}
	public String getCnstrct_entrps() {
		return cnstrct_entrps;
	}
	public void setCnstrct_entrps(String cnstrct_entrps) {
		this.cnstrct_entrps = cnstrct_entrps;
	}
	public String getCnstrtr() {
		return cnstrtr;
	}
	public void setCnstrtr(String cnstrtr) {
		this.cnstrtr = cnstrtr;
	}
	public String getBsns_info() {
		return bsns_info;
	}
	public void setBsns_info(String bsns_info) {
		this.bsns_info = bsns_info;
	}
	public String getFclts_seq_no() {
		return fclts_seq_no;
	}
	public void setFclts_seq_no(String fclts_seq_no) {
		this.fclts_seq_no = fclts_seq_no;
	}
	public String getFclts_pic() {
		return fclts_pic;
	}
	public void setFclts_pic(String fclts_pic) {
		this.fclts_pic = fclts_pic;
	}
	public String getUse_imprty_yn() {
		return use_imprty_yn;
	}
	public void setUse_imprty_yn(String use_imprty_yn) {
		this.use_imprty_yn = use_imprty_yn;
	}
	public String getMntrng_yn() {
		return mntrng_yn;
	}
	public void setMntrng_yn(String mntrng_yn) {
		this.mntrng_yn = mntrng_yn;
	}
	public String getFclts_stts() {
		return fclts_stts;
	}
	public void setFclts_stts(String fclts_stts) {
		this.fclts_stts = fclts_stts;
	}
	public String getAlarm_mntrg_exc_yn() {
		return alarm_mntrg_exc_yn;
	}
	public void setAlarm_mntrg_exc_yn(String alarm_mntrg_exc_yn) {
		this.alarm_mntrg_exc_yn = alarm_mntrg_exc_yn;
	}
	public String getNow_alarm_stts() {
		return now_alarm_stts;
	}
	public void setNow_alarm_stts(String now_alarm_stts) {
		this.now_alarm_stts = now_alarm_stts;
	}
	public String getNow_alarm_stts_crtr_dt() {
		return now_alarm_stts_crtr_dt;
	}
	public void setNow_alarm_stts_crtr_dt(String now_alarm_stts_crtr_dt) {
		this.now_alarm_stts_crtr_dt = now_alarm_stts_crtr_dt;
	}
	public String getTrobl_dt() {
		return trobl_dt;
	}
	public void setTrobl_dt(String trobl_dt) {
		this.trobl_dt = trobl_dt;
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
	public String getCycle_tmunit() {
		return cycle_tmunit;
	}
	public void setCycle_tmunit(String cycle_tmunit) {
		this.cycle_tmunit = cycle_tmunit;
	}
	public int getSave_cycle() {
		return save_cycle;
	}
	public void setSave_cycle(int save_cycle) {
		this.save_cycle = save_cycle;
	}
	public int getAnal_cycle() {
		return anal_cycle;
	}
	public void setAnal_cycle(int anal_cycle) {
		this.anal_cycle = anal_cycle;
	}
	public int getClct_cycle() {
		return clct_cycle;
	}
	public void setClct_cycle(int clct_cycle) {
		this.clct_cycle = clct_cycle;
	}
	public int getExprs_cycle() {
		return exprs_cycle;
	}
	public void setExprs_cycle(int exprs_cycle) {
		this.exprs_cycle = exprs_cycle;
	}
	public int getReclct_cycle() {
		return reclct_cycle;
	}
	public void setReclct_cycle(int reclct_cycle) {
		this.reclct_cycle = reclct_cycle;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
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
	public String getRecnt_prcs_dt() {
		return recnt_prcs_dt;
	}
	public void setRecnt_prcs_dt(String recnt_prcs_dt) {
		this.recnt_prcs_dt = recnt_prcs_dt;
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
	public String getAnls_cycle() {
		return anls_cycle;
	}
	public void setAnls_cycle(String anls_cycle) {
		this.anls_cycle = anls_cycle;
	}
	public int getReprsnt_img_file_id() {
		return reprsnt_img_file_id;
	}
	public void setReprsnt_img_file_id(int reprsnt_img_file_id) {
		this.reprsnt_img_file_id = reprsnt_img_file_id;
	}
	
	
	
}
