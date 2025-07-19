package kaw.levelup.mmca.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kaw.levelup.mmca.main.data.entity.ExhibitObj;
import kaw.levelup.mmca.main.data.vo.ExhibitDTO;
import kaw.levelup.mmca.main.data.vo.ExhibitObjDTO;
import kaw.levelup.mmca.main.repository.ExhibitObjRepository;
import kaw.levelup.mmca.main.service.AdminService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{

	@Autowired
	private final ExhibitObjRepository exhibitObjRepository;

	/** 신규 전시 등록
	 *
	 */
	@Override
	public int addExhibit(ExhibitDTO exhibit) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 전시품 조회
	 *
	 */
	@Override
	public List<ExhibitObjDTO> selectExhObj(ExhibitObjDTO exhibitObj) {
		
		System.out.println("=========== " + exhibitObj.getObjNm()+" ===========" );
		
		List<ExhibitObj> objList = new ArrayList<ExhibitObj>(); 
//				exhibitObjRepository.findAll();
		if(exhibitObj.getObjNm() == null && exhibitObj.getObjWritr() == null) {
			objList = exhibitObjRepository.findAll();
		}
		else {
			objList = exhibitObjRepository.findByObjNmContainingOrObjWritrContaining(exhibitObj.getObjNm(), exhibitObj.getObjWritr());
		}
		
		
		
		// Entity 객체를 DTO로 변환
		List<ExhibitObjDTO> resultList = new ArrayList<>();
		
		for(ExhibitObj obj : objList) {
			resultList.add(obj.toDTO());
		}
		return resultList;
	}

	
	
}
