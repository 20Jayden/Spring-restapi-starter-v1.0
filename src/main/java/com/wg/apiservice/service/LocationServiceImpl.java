package com.wg.apiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wg.apiservice.mapper.LocationMapper;
import com.wg.apiservice.model.LctnVO;

@Service
public class LocationServiceImpl implements LocationService{
	
	@Autowired
	private LocationMapper apiMapper;
	
	
	public List<LctnVO> selectAllLocation() throws Exception{
		return apiMapper.selectAllLocation();
	}
	
	public List<LctnVO> selectLocation(String lctn_cd) throws Exception{
		return apiMapper.selectLocation(lctn_cd);
	}

	public int insertLocation(LctnVO vo) throws Exception {
		return apiMapper.insertLocation(vo);
	}

	public int updateLocation(String lctn_cd, LctnVO vo) throws Exception {
		vo.setLctn_cd(lctn_cd);
		
		return apiMapper.updateLocation(vo);
	}
	
	public int deleteLocation(String lctn_cd) throws Exception {
		return apiMapper.deleteLocation(lctn_cd);
	}
	
}
