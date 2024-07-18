package kaw.levelup.mmca.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kaw.levelup.mmca.main.data.vo.MusumInfoVO;
import kaw.levelup.mmca.main.data.vo.MusumPlaceVO;
import kaw.levelup.mmca.main.service.MusumInfoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/musumInfo")
@Tag(name = "미술관 정보", description = "메인 화면에 필요한 미술관 정보를 불러옵니다.")
@RequiredArgsConstructor
public class MusumController {
	
	@Autowired
	private final MusumInfoService musumInfoService;


	@GetMapping("/getMusumList")
	@Operation(summary = "미술관 목록 조회", description = "미술관 목록 조회")
	public ResponseEntity<List<MusumInfoVO>> getMusumList() {
		List<MusumInfoVO> res = musumInfoService.getMusumList();
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	
	@GetMapping("/getMusumPlaceList/{musumCd}")
	@Operation(summary = "시설정보 목록 조회", description = "편의시설 및 문화시설 조회")
	public ResponseEntity<List<MusumPlaceVO>> getMusumPlaceList(@PathVariable String musumCd) {
		List<MusumPlaceVO> res = musumInfoService.getMusumPlaceList(musumCd);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	@PostMapping("/createMusumPlace")
	@Operation(summary = "시설정보 등록", description = "편의시설 및 문화시설 등록")
	public void createMusumPlace(MusumPlaceVO vo) {
		musumInfoService.createMusumPlace(vo);
	}
}
