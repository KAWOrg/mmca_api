package kaw.levelup.mmca.main.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import kaw.levelup.mmca.main.data.entity.MusumInfo;
import kaw.levelup.mmca.main.data.entity.MusumPlace;
import kaw.levelup.mmca.main.data.vo.MusumInfoVO;
import kaw.levelup.mmca.main.data.vo.MusumPlaceVO;
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
	public List<MusumInfoVO> getMusumList() {
		// .findAll()로 List 반환
		List<MusumInfo> res = musumInfoRepository.findAll();
		
		// List -> VO로 변환
		List<MusumInfoVO> vo = res.stream()
						.map(v -> new MusumInfoVO(
								v.getMusumCd(),
								v.getMusumNm(),
								v.getMusumAddr(),
								v.getMusumMailAddr(),
								v.getMusumTel()))
						.collect(Collectors.toList());
		return vo;
	}

	@Override
	public List<MusumPlaceVO> getMusumPlaceList(String musumCd) {
		List<MusumPlace> res = musumPlaceRepository.findByMusumCd(musumCd);

		// List -> VO로 변환
		// 추후 빌더로 수정할 것
		List<MusumPlaceVO> vo = res.stream()
						.map(v -> new MusumPlaceVO(
								v.getPlaceId(),
								v.getPlaceTypeCd(),
								v.getPlaceNm(),
								v.getImageFile(),
								v.getPlaceDscrp(),
								v.getMusumCd()))
						.collect(Collectors.toList());			
		
		
		return vo;
	}

	@Override
	public void createMusumPlace(MusumPlaceVO vo) {
		//vo.builder()
		
//		MusumPlaceVO dddd = vo.builder()
//		.placeId(vo.getPlaceId())
//		.placeNm(vo.getPlaceNm())
//		.placeTypeCd(vo.getPlaceTypeCd())
//		.placeDscrp(vo.getPlaceDscrp())
//		.build();
//		
//		dddd.toEntity();
		
		// Entity 객체를 new로 생성하면 객체무결성이 깨질 수 있음, 추후 빌더로 리팩토링 고민해보기
		MusumPlace musumPlace = new MusumPlace(vo.getPlaceId(), vo.getPlaceTypeCd(), vo.getPlaceNm(), vo.getPlaceDscrp(), vo.getMusumCd());
		
		musumPlaceRepository.save(musumPlace);
	}
	

}
