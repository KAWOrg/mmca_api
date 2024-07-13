package kaw.levelup.mmca.main.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kaw.levelup.mmca.main.data.entity.MusumInfo;
import kaw.levelup.mmca.main.data.vo.MusumInfoVO;
import kaw.levelup.mmca.main.repository.MusumInfoRepository;
import kaw.levelup.mmca.main.service.MusumInfoService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MusumInfoServiceImpl implements MusumInfoService {
	
	@Autowired
    private final MusumInfoRepository musumInfoRepository;

	@Override
	public List<MusumInfoVO> getMusumList() {
		// .findAll()로 List 반환
		List<MusumInfo> res = musumInfoRepository.findAll();
		
		// List -> VO로 변환
		List<MusumInfoVO> vo = res.stream()
						.map(v -> new MusumInfoVO(
								v.getMusumCode(),
								v.getMusumNm(),
								v.getMusumAddr(),
								v.getMusumMailAddr(),
								v.getMusumTel()))
						.collect(Collectors.toList());
		return vo;
	}

}
