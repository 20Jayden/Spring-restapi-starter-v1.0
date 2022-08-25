package com.wg.apiservice.service;

import java.util.List;

import com.wg.apiservice.model.FcltyVO;

public interface FacilityService {
	
	public List<FcltyVO> selectAllFacility() throws Exception;
	
	public List<FcltyVO> selectFacility(String fclty_id) throws Exception;

	public int insertFacility(FcltyVO vo) throws Exception;
	
	public int updateFacility(String fclty_id, FcltyVO vo) throws Exception;

	public int deleteFacility(String fclty_id) throws Exception;
}
