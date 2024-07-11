package kaw.levelup.mmca.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import kaw.levelup.mmca.main.data.vo.MusumInfoVO;
import kaw.levelup.mmca.main.repository.MusumInfoRepository;
import kaw.levelup.mmca.main.service.MusumInfoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HomeController {
	
	@Autowired
	private final MusumInfoService musumInfoService;
	
	/*
	 * @Autowired public HomeController(MusumInfoService musumInfoService) {
	 * this.musumInfoService = musumInfoService; }
	 */

	@GetMapping("/main.do")
	public ResponseEntity<List<MusumInfoVO>> home() {
		ResponseEntity<List<MusumInfoVO>> res = musumInfoService.getMusumList();
		return res;
	}
}
