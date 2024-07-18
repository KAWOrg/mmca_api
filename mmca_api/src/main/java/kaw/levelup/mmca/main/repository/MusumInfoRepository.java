package kaw.levelup.mmca.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kaw.levelup.mmca.main.data.entity.MusumInfo;

@Repository
public interface MusumInfoRepository extends JpaRepository<MusumInfo, String>{
	// 미술관 정보
}
