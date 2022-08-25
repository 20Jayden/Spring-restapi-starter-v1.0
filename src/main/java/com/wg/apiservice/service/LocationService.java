package com.wg.apiservice.service;

import java.util.List;

import com.wg.apiservice.model.LctnVO;

public interface LocationService {
	
	public List<LctnVO> selectAllLocation() throws Exception;
	
	public List<LctnVO> selectLocation(String lctn_cd) throws Exception;

	public int insertLocation(LctnVO vo) throws Exception;
	
	public int updateLocation(String lctn_cd, LctnVO vo) throws Exception;

	public int deleteLocation(String lctn_cd) throws Exception;
}
