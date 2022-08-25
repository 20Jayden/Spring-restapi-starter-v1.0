package com.wg.apiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wg.apiservice.mapper.FacilityMapper;
import com.wg.apiservice.model.FcltyVO;

@Service
public class FacilityServiceImpl implements FacilityService{
	
	@Autowired
	private FacilityMapper apiMapper;
	
	
	public List<FcltyVO> selectAllFacility() throws Exception{
		return apiMapper.selectAllFacility();
	}
	
	public List<FcltyVO> selectFacility(String fclty_id) throws Exception{
		return apiMapper.selectFacility(fclty_id);
	}

	public int insertFacility(FcltyVO vo) throws Exception {
		return apiMapper.insertFacility(vo);
	}

	public int updateFacility(String fclty_id, FcltyVO vo) throws Exception {
		vo.setFclty_id(fclty_id);
		
		return apiMapper.updateFacility(vo);
	}
	
	public int deleteFacility(String fclty_id) throws Exception {
		return apiMapper.deleteFacility(fclty_id);
	}
	
}
