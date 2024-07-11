package kaw.levelup.mmca.main.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import kaw.levelup.mmca.main.data.vo.MusumInfoVO;

public interface MusumInfoService {
	
	ResponseEntity<List<MusumInfoVO>> getMusumList();
}
