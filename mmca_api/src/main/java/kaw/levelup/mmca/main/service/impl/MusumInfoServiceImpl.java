package kaw.levelup.mmca.main.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import kaw.levelup.mmca.main.data.entity.MusumInfo;
import kaw.levelup.mmca.main.data.entity.MusumPlace;
import kaw.levelup.mmca.main.data.vo.MusumInfoDTO;
import kaw.levelup.mmca.main.data.vo.MusumPlaceDTO;
import kaw.levelup.mmca.main.repository.MusumInfoRepository;
import kaw.levelup.mmca.main.repository.MusumPlaceRepository;
import kaw.levelup.mmca.main.service.MusumInfoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MusumInfoServiceImpl implements MusumInfoService {
	
	@Autowired
    private final MusumInfoRepository musumInfoRepository;
	@Autowired
	private final MusumPlaceRepository musumPlaceRepository;

	@Override
	public List<MusumInfoDTO> getMusumList() {
		// .findAll()로 List 반환
		List<MusumInfo> res = musumInfoRepository.findAll();
		
		// Entity 객체를 DTO로 변환
		List<MusumInfoDTO> resultList = new ArrayList<>();
		for(MusumInfo musumInfo : res) {
			resultList.add(musumInfo.toDTO());
		}
		
		return resultList;
	}

	@Override
	public List<MusumPlaceDTO> getMusumPlaceList(String musumCd) {
		List<MusumPlace> res = musumPlaceRepository.findByMusumCd(musumCd);
		
		// List -> DTO로 변환
//		List<MusumPlaceDTO> returnList = new ArrayList<>();
//		
//		for (MusumPlace musumPlace : res) {
//			returnList.add(musumPlace.toDTO());
//		}

		return res.stream()
				.map(MusumPlace::toDTO)
				.collect(Collectors.toList());
	}

	@Override
	public void createPlace(MusumPlaceDTO dto) {
		// Entity 객체를 new로 생성하면 객체무결성이 깨질 수 있음, 추후 빌더로 리팩토링 고민해보기
		MusumPlace entity = dto.toEntity();
		
		musumPlaceRepository.save(entity);
	}
	

}
