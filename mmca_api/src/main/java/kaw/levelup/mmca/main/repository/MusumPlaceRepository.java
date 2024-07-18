package kaw.levelup.mmca.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kaw.levelup.mmca.main.data.entity.MusumPlace;

@Repository
public interface MusumPlaceRepository extends JpaRepository<MusumPlace, String> {
	// 미술관 시설정보
	List<MusumPlace> findByMusumCd(String musumCd);

}
