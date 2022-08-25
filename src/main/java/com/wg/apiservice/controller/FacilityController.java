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

import com.wg.apiservice.model.FcltyVO;
import com.wg.apiservice.service.FacilityService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value="/fclty")
public class FacilityController {
	
	@Autowired
	private FacilityService service;
	
	
	@Operation(summary = "시설정보 조회(전체)")
	@GetMapping("")
	public List<FcltyVO> selectAllFacility() throws Exception{
		List<FcltyVO> list = service.selectAllFacility();
		return list;
	}
	
	@Operation(summary = "시설정보 조회")
	@GetMapping("/{fclty_id}")
	public List<FcltyVO> selectFacility(@PathVariable("fclty_id") String fclty_id) throws Exception{
		
		return service.selectFacility(fclty_id);
	}
	
	@Operation(summary = "시설정보 등록")
	@PostMapping("")
	public List<FcltyVO> insertFacility(@RequestBody FcltyVO vo) throws Exception {
		service.insertFacility(vo);
		return service.selectFacility(vo.getFclty_id());
	}
	
	@Operation(summary = "시설정보 수정")
	@PutMapping("/{fclty_id}")
	public List<FcltyVO> updateFacility(@PathVariable("fclty_id") String fclty_id, @RequestBody FcltyVO vo) throws Exception {
		service.updateFacility(fclty_id, vo);
		return service.selectFacility(fclty_id);
	}
	
	@Operation(summary = "시설정보 삭제")
	@DeleteMapping("/{fclty_id}")
	public List<FcltyVO> deleteFacility(@PathVariable("fclty_id") String fclty_id) throws Exception {
		service.deleteFacility(fclty_id);
		
		return service.selectFacility(fclty_id);
	}
}

