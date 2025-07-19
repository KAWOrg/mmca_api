package kaw.levelup.mmca.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kaw.levelup.mmca.main.data.vo.ExhibitDTO;
import kaw.levelup.mmca.main.data.vo.ExhibitObjDTO;
import kaw.levelup.mmca.main.service.AdminService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/admin")
@Tag(name="관리자 페이지", description = "정보 등록 및 수정이 가능합니다.")
@RequiredArgsConstructor
public class AdminController {

	@Autowired
	private final AdminService adminService;
	
	@PostMapping(value = "/addExh")
	@Operation(summary = "전시 등록", description = "신규 전시 등록")
	public int addExhibit(@RequestBody ExhibitDTO exhibit) {
		return adminService.addExhibit(exhibit); 
	}
	
	
	@PostMapping(value = "/selectExhObj")
	@Operation(summary = "전시품 조회", description = "전시품 조회")
	public ResponseEntity<List<ExhibitObjDTO>> selectExhObj(@RequestBody ExhibitObjDTO obj) {
		List<ExhibitObjDTO> res = adminService.selectExhObj(obj); 
		return ResponseEntity.ok(res);
	}
	
	
}
