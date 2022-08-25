package com.wg.apiservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wg.apiservice.model.FcltsVO;


@Mapper
public interface FacilitiesMapper {
	
	public List<FcltsVO> selectAllFacilities() throws Exception;
	
	public List<FcltsVO> selectFacilities(int fclts_seq) throws Exception;

	public int insertFacilities(FcltsVO vo) throws Exception;

	public int updateFacilities(FcltsVO vo) throws Exception;

	public int deleteFacilities(int fclts_seq) throws Exception;
	
}
