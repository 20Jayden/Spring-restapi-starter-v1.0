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

import com.wg.apiservice.model.LctnVO;
import com.wg.apiservice.service.LocationService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping(value="/lctn")
public class LocationController {
	
	@Autowired
	private LocationService service;
	
	@Operation(summary = "��ġ���� ��ȸ(��ü)")
	@GetMapping("")
	public List<LctnVO> selectAllLocation() throws Exception{
		List<LctnVO> list = service.selectAllLocation();
		return list;
	}
	
	@Operation(summary = "��ġ���� ��ȸ")
	@GetMapping("/{lctn_cd}")
	public List<LctnVO> selectLocation(@PathVariable("lctn_cd") String lctn_cd) throws Exception{
		
		return service.selectLocation(lctn_cd);
	}
	
	@Operation(summary = "��ġ���� ���")
	@PostMapping("")
	public List<LctnVO> insertLocation(@RequestBody LctnVO vo) throws Exception {
		service.insertLocation(vo);
		
		return service.selectLocation(vo.getLctn_cd());
	}
	
	@Operation(summary = "��ġ���� ����")
	@PutMapping("/{lctn_cd}")
	public List<LctnVO> updateLocation(@PathVariable("lctn_cd") String lctn_cd, @RequestBody LctnVO vo) throws Exception {
		service.updateLocation(lctn_cd, vo);
		return service.selectLocation(lctn_cd);
	}
	
	@Operation(summary = "��ġ���� ����")
	@DeleteMapping("/{lctn_cd}")
	public List<LctnVO> deleteLocation(@PathVariable("lctn_cd") String lctn_cd) throws Exception {
		service.deleteLocation(lctn_cd);
		
		return service.selectLocation(lctn_cd);
	}
}

