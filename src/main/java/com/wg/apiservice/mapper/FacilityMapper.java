package com.wg.apiservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wg.apiservice.model.FcltyVO;


@Mapper
public interface FacilityMapper {
	
	public List<FcltyVO> selectAllFacility() throws Exception;
	
	public List<FcltyVO> selectFacility(String fclty_id) throws Exception;

	public int insertFacility(FcltyVO vo) throws Exception;

	public int updateFacility(FcltyVO vo) throws Exception;

	public int deleteFacility(String fclty_id) throws Exception;
	
}
