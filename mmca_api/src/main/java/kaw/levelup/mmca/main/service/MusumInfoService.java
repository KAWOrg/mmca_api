package kaw.levelup.mmca.main.service;

import java.util.List;

import kaw.levelup.mmca.main.data.vo.MusumInfoVO;
import kaw.levelup.mmca.main.data.vo.MusumPlaceVO;


public interface MusumInfoService {
	
	List<MusumInfoVO> getMusumList();
	List<MusumPlaceVO> getMusumPlaceList(String musumCd);
	void createMusumPlace(MusumPlaceVO vo);
}
