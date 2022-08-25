package com.wg.apiservice.service;

import java.util.List;

import com.wg.apiservice.model.FcltsVO;

public interface FacilitiesService {
	
	public List<FcltsVO> selectAllFacilities() throws Exception;
	
	public List<FcltsVO> selectFacilities(int fclts_seq) throws Exception;

	public int insertFacilities(FcltsVO vo) throws Exception;
	
	public int updateFacilities(int fclts_seq, FcltsVO vo) throws Exception;

	public int deleteFacilities(int fclts_seq) throws Exception;
	
}
