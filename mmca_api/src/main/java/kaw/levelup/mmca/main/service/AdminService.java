package kaw.levelup.mmca.main.service;

import java.util.List;

import kaw.levelup.mmca.main.data.vo.ExhibitDTO;
import kaw.levelup.mmca.main.data.vo.ExhibitObjDTO;

public interface AdminService {

	/** 전시 추가
	 * @param exhibit
	 * @return
	 */
	int addExhibit(ExhibitDTO exhibit);

	/** 전시품 조회
	 * @param exhibitObj 
	 * @return
	 */
	List<ExhibitObjDTO> selectExhObj(ExhibitObjDTO exhibitObj);

}
