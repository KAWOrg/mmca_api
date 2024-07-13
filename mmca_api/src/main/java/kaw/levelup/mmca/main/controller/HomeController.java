package kaw.levelup.mmca.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kaw.levelup.mmca.main.data.vo.MusumInfoVO;
import kaw.levelup.mmca.main.service.MusumInfoService;
import lombok.RequiredArgsConstructor;

@RestController
@Tag(name = "미술관 정보", description = "메인 화면에 필요한 미술관 정보를 불러옵니다.")
@RequiredArgsConstructor
public class HomeController {
	
	@Autowired
	private final MusumInfoService musumInfoService;


	@GetMapping("/main.do")
	@Operation(summary = "미술관 목록", description = "미술관 목록 불러오기")
	public ResponseEntity<List<MusumInfoVO>> home() {
		List<MusumInfoVO> res = musumInfoService.getMusumList();
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
}
