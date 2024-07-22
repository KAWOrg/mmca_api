package kaw.levelup.mmca.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kaw.levelup.mmca.admin.data.vo.ProgramDTO;
import kaw.levelup.mmca.admin.service.AdminService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/admin")
@Tag(name="관리자 페이지", description="관리자 페이지입니다.")
@RequiredArgsConstructor
public class AdminController {

	@Autowired
	private final AdminService adminService;
	
	@GetMapping("/getExhbtList")
	@Operation(summary = "전시 목록 조회", description = "전시 목록 조회")
	public ResponseEntity<List<ProgramDTO>> getExhbtList() {
		List<ProgramDTO> res = adminService.getExhbtList();
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
}
