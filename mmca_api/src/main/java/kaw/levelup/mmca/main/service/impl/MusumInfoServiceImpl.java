package kaw.levelup.mmca.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import kaw.levelup.mmca.main.data.vo.MusumInfoVO;
import kaw.levelup.mmca.main.repository.MusumInfoRepository;
import kaw.levelup.mmca.main.service.MusumInfoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MusumInfoServiceImpl implements MusumInfoService{
	/*
	 * MusumInfoRepository musumInfoRepository;
	 * 
	 * @Autowired public MusumInfoServiceImpl(MusumInfoRepository
	 * musumInfoRepository) { this.musumInfoRepository = musumInfoRepository; }
	 */
	
	@Override
	public ResponseEntity<List<MusumInfoVO>> getMusumList() {
	//	ResponseEntity<List<MusumInfoVO>> res = (ResponseEntity<List<MusumInfoVO>>) musumInfoRepository.findAll();
		ResponseEntity<List<MusumInfoVO>> res=null;
		return res;
	}

}
