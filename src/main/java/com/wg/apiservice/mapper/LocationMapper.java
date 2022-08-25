package com.wg.apiservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wg.apiservice.model.LctnVO;


@Mapper
public interface LocationMapper {
	
	public List<LctnVO> selectAllLocation() throws Exception;
	
	public List<LctnVO> selectLocation(String lctn_cd) throws Exception;

	public int insertLocation(LctnVO vo) throws Exception;

	public int updateLocation(LctnVO vo) throws Exception;

	public int deleteLocation(String lctn_cd) throws Exception;
	
}
