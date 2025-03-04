package kaw.levelup.mmca.main.service;

import java.util.List;

import kaw.levelup.mmca.main.data.vo.MusumInfoDTO;
import kaw.levelup.mmca.main.data.vo.MusumPlaceDTO;


public interface MusumInfoService {
	
	List<MusumInfoDTO> getMusumList();
	List<MusumPlaceDTO> getMusumPlaceList(String musumCd);
	void createPlace(MusumPlaceDTO dto);
}
