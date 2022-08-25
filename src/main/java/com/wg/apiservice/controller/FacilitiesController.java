package com.wg.apiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wg.apiservice.model.FcltsVO;
import com.wg.apiservice.service.FacilitiesService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping(value="/fclts")
public class FacilitiesController {
	
	@Autowired
	private FacilitiesService service;
	
	
	@Operation(summary = "시설물정보 조회(전체)")
	@GetMapping("")
	public List<FcltsVO> selectAllFacilities() throws Exception{
		List<FcltsVO> list = service.selectAllFacilities();
		return list;
	}
	
	@Operation(summary = "시설물정보 조회")
	@GetMapping("/{fclts_seq}")
	public List<FcltsVO> selectFacilities(@PathVariable("fclts_seq") int fclts_seq) throws Exception{
		
		return service.selectFacilities(fclts_seq);
	}
	
	@Operation(summary = "시설물정보 등록")
	@PostMapping("")
	public List<FcltsVO> insertFacilities(@RequestBody FcltsVO vo) throws Exception {
		service.insertFacilities(vo);
		return service.selectFacilities((int) vo.getFclts_seq());
	}
	
	@Operation(summary = "시설물정보 수정")
	@PutMapping("/{fclts_seq}")
	public List<FcltsVO> updateFacilities(@PathVariable("fclts_seq") int fclts_seq, @RequestBody FcltsVO vo) throws Exception {
		service.updateFacilities(fclts_seq, vo);
		return service.selectFacilities(fclts_seq);
	}
	
	@Operation(summary = "시설물정보 삭제")
	@DeleteMapping("/{fclts_seq}")
	public List<FcltsVO> deleteFacilities(@PathVariable("fclts_seq") int fclts_seq) throws Exception {
		service.deleteFacilities(fclts_seq);
		
		return service.selectFacilities(fclts_seq);
	}
}

