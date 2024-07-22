package kaw.levelup.mmca.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kaw.levelup.mmca.admin.data.entitiy.Program;
import kaw.levelup.mmca.admin.data.vo.ProgramDTO;
import kaw.levelup.mmca.admin.repository.ProgramInfoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private final ProgramInfoRepository programInfoRepository;
	
	@Override
	public List<ProgramDTO> getExhbtList() {
		
		List<ProgramDTO> res = programInfoRepository.findAll();
		
		// Entity 객체를 DTO로 변환
		List<ProgramDTO> resultList = new ArrayList<>();
		for(Program Program : res) {
			resultList.add(Program.toDTO());
		}
		
		return resultList;
	};
}
