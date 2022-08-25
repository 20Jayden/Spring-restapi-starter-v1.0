package com.wg.apiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wg.apiservice.mapper.FacilitiesMapper;
import com.wg.apiservice.model.FcltsVO;

@Service
public class FacilitiesServiceImpl implements FacilitiesService{
	
	@Autowired
	private FacilitiesMapper apiMapper;
	
	
	public List<FcltsVO> selectAllFacilities() throws Exception{
		return apiMapper.selectAllFacilities();
	}
	
	public List<FcltsVO> selectFacilities(int fclts_seq) throws Exception{
		return apiMapper.selectFacilities(fclts_seq);
	}

	public int insertFacilities(FcltsVO vo) throws Exception {
		return apiMapper.insertFacilities(vo);
	}

	public int updateFacilities(int fclts_seq, FcltsVO vo) throws Exception {
		vo.setFclts_seq(fclts_seq);
		
		return apiMapper.updateFacilities(vo);
	}
	
	public int deleteFacilities(int fclts_seq) throws Exception {
		return apiMapper.deleteFacilities(fclts_seq);
	}
	
}
