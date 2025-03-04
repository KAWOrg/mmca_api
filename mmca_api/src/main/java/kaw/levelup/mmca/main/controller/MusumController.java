package kaw.levelup.mmca.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kaw.levelup.mmca.main.data.entity.MusumPlace;
import kaw.levelup.mmca.main.data.vo.MusumInfoDTO;
import kaw.levelup.mmca.main.data.vo.MusumPlaceDTO;
import kaw.levelup.mmca.main.service.MusumInfoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/museums")
@Tag(name = "미술관 정보", description = "메인 화면에 필요한 미술관 정보를 불러옵니다.")
@RequiredArgsConstructor
public class MusumController {
	
	@Autowired
	private final MusumInfoService musumInfoService;


	@GetMapping
	@Operation(summary = "미술관 목록 조회", description = "미술관 목록 조회")
	public ResponseEntity<List<MusumInfoDTO>> getMusumList() {
		List<MusumInfoDTO> res = musumInfoService.getMusumList();
		return ResponseEntity.ok(res);
	}
	
	@GetMapping("/{musumCd}/places")
	@Operation(summary = "시설정보 목록 조회", description = "편의시설 및 문화시설 조회")
	public ResponseEntity<List<MusumPlaceDTO>> getMusumPlaceList(@PathVariable String musumCd) {
		List<MusumPlaceDTO> res = musumInfoService.getMusumPlaceList(musumCd);
		return ResponseEntity.ok(res);
	}
	
	@PostMapping(value = "/place", consumes = "multipart/form-data")
	@Operation(summary = "시설정보 등록", description = "편의시설 및 문화시설 등록")
	public void createPlace(@ModelAttribute MusumPlaceDTO dto) {
		musumInfoService.createPlace(dto);
	}
}
