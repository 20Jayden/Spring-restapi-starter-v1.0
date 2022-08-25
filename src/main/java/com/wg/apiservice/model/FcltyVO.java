package com.wg.apiservice.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "½Ã¼³")
public class FcltyVO {
	
	private String fclty_id;
	private float file_id;
	private String fclty_nm;
	private String msrmt_bgng_dt;
	private String msrmt_end_dt;
	private float lat;
	private float lot;
	private String fclty_cn;
	private String use_posbl_spt_yn;
	private String mng_oper_mby;
	private String etc;
	private String nrmlt_msrmt_yn_ceck_dt;
	private int nrmlt_msrmt_yn_ceck_min_intrvl;
	private String sys_err_exst_yn;
	private int sys_err_mntrg_intrvl;
	private String alarm_mntrg_exc_yn;
	private int spt_alarm_stts;
	private int now_alarm_grad4_sensor_co;
	private int now_alarm_grad3_sensor_co;
	private int now_alarm_grad2_sensor_co;
	private int now_alarm_grad1_sensor_co;
	private int now_alarm_normal_sensor_co;
	private int all_sensor_co;
	private int useful_sensor_co;
	private int nrmlt_opr_sensor_co;
	private float opr_rt;
	private int nrmlt_opr_sensor_ceck_intrvl;
	private String use_yn;
	private String del_yn;
	private String reg_id;
	private String mdfcn_id;
	
	public String getFclty_id() {
		return fclty_id;
	}
	public void setFclty_id(String fclty_id) {
		this.fclty_id = fclty_id;
	}
	public float getFile_id() {
		return file_id;
	}
	public void setFile_id(float file_id) {
		this.file_id = file_id;
	}
	public String getFclty_nm() {
		return fclty_nm;
	}
	public void setFclty_nm(String fclty_nm) {
		this.fclty_nm = fclty_nm;
	}
	public String getMsrmt_bgng_dt() {
		return msrmt_bgng_dt;
	}
	public void setMsrmt_bgng_dt(String msrmt_bgng_dt) {
		this.msrmt_bgng_dt = msrmt_bgng_dt;
	}
	public String getMsrmt_end_dt() {
		return msrmt_end_dt;
	}
	public void setMsrmt_end_dt(String msrmt_end_dt) {
		this.msrmt_end_dt = msrmt_end_dt;
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
	public String getFclty_cn() {
		return fclty_cn;
	}
	public void setFclty_cn(String fclty_cn) {
		this.fclty_cn = fclty_cn;
	}
	public String getUse_posbl_spt_yn() {
		return use_posbl_spt_yn;
	}
	public void setUse_posbl_spt_yn(String use_posbl_spt_yn) {
		this.use_posbl_spt_yn = use_posbl_spt_yn;
	}
	public String getMng_oper_mby() {
		return mng_oper_mby;
	}
	public void setMng_oper_mby(String mng_oper_mby) {
		this.mng_oper_mby = mng_oper_mby;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getNrmlt_msrmt_yn_ceck_dt() {
		return nrmlt_msrmt_yn_ceck_dt;
	}
	public void setNrmlt_msrmt_yn_ceck_dt(String nrmlt_msrmt_yn_ceck_dt) {
		this.nrmlt_msrmt_yn_ceck_dt = nrmlt_msrmt_yn_ceck_dt;
	}
	public int getNrmlt_msrmt_yn_ceck_min_intrvl() {
		return nrmlt_msrmt_yn_ceck_min_intrvl;
	}
	public void setNrmlt_msrmt_yn_ceck_min_intrvl(int nrmlt_msrmt_yn_ceck_min_intrvl) {
		this.nrmlt_msrmt_yn_ceck_min_intrvl = nrmlt_msrmt_yn_ceck_min_intrvl;
	}
	public String getSys_err_exst_yn() {
		return sys_err_exst_yn;
	}
	public void setSys_err_exst_yn(String sys_err_exst_yn) {
		this.sys_err_exst_yn = sys_err_exst_yn;
	}
	public int getSys_err_mntrg_intrvl() {
		return sys_err_mntrg_intrvl;
	}
	public void setSys_err_mntrg_intrvl(int sys_err_mntrg_intrvl) {
		this.sys_err_mntrg_intrvl = sys_err_mntrg_intrvl;
	}
	public String getAlarm_mntrg_exc_yn() {
		return alarm_mntrg_exc_yn;
	}
	public void setAlarm_mntrg_exc_yn(String alarm_mntrg_exc_yn) {
		this.alarm_mntrg_exc_yn = alarm_mntrg_exc_yn;
	}
	public int getSpt_alarm_stts() {
		return spt_alarm_stts;
	}
	public void setSpt_alarm_stts(int spt_alarm_stts) {
		this.spt_alarm_stts = spt_alarm_stts;
	}
	public int getNow_alarm_grad4_sensor_co() {
		return now_alarm_grad4_sensor_co;
	}
	public void setNow_alarm_grad4_sensor_co(int now_alarm_grad4_sensor_co) {
		this.now_alarm_grad4_sensor_co = now_alarm_grad4_sensor_co;
	}
	public int getNow_alarm_grad3_sensor_co() {
		return now_alarm_grad3_sensor_co;
	}
	public void setNow_alarm_grad3_sensor_co(int now_alarm_grad3_sensor_co) {
		this.now_alarm_grad3_sensor_co = now_alarm_grad3_sensor_co;
	}
	public int getNow_alarm_grad2_sensor_co() {
		return now_alarm_grad2_sensor_co;
	}
	public void setNow_alarm_grad2_sensor_co(int now_alarm_grad2_sensor_co) {
		this.now_alarm_grad2_sensor_co = now_alarm_grad2_sensor_co;
	}
	public int getNow_alarm_grad1_sensor_co() {
		return now_alarm_grad1_sensor_co;
	}
	public void setNow_alarm_grad1_sensor_co(int now_alarm_grad1_sensor_co) {
		this.now_alarm_grad1_sensor_co = now_alarm_grad1_sensor_co;
	}
	public int getNow_alarm_normal_sensor_co() {
		return now_alarm_normal_sensor_co;
	}
	public void setNow_alarm_normal_sensor_co(int now_alarm_normal_sensor_co) {
		this.now_alarm_normal_sensor_co = now_alarm_normal_sensor_co;
	}
	public int getAll_sensor_co() {
		return all_sensor_co;
	}
	public void setAll_sensor_co(int all_sensor_co) {
		this.all_sensor_co = all_sensor_co;
	}
	public int getUseful_sensor_co() {
		return useful_sensor_co;
	}
	public void setUseful_sensor_co(int useful_sensor_co) {
		this.useful_sensor_co = useful_sensor_co;
	}
	public int getNrmlt_opr_sensor_co() {
		return nrmlt_opr_sensor_co;
	}
	public void setNrmlt_opr_sensor_co(int nrmlt_opr_sensor_co) {
		this.nrmlt_opr_sensor_co = nrmlt_opr_sensor_co;
	}
	public float getOpr_rt() {
		return opr_rt;
	}
	public void setOpr_rt(float opr_rt) {
		this.opr_rt = opr_rt;
	}
	public int getNrmlt_opr_sensor_ceck_intrvl() {
		return nrmlt_opr_sensor_ceck_intrvl;
	}
	public void setNrmlt_opr_sensor_ceck_intrvl(int nrmlt_opr_sensor_ceck_intrvl) {
		this.nrmlt_opr_sensor_ceck_intrvl = nrmlt_opr_sensor_ceck_intrvl;
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
