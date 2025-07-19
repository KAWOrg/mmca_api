package kaw.levelup.mmca.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kaw.levelup.mmca.main.data.entity.ExhibitObj;

@Repository
public interface ExhibitObjRepository extends JpaRepository<ExhibitObj, String>{

	/** 전시품 검색 (전시품 명 or 작가명)
	 * @param objWritr 
	 * @param objNm 
	 * @return
	 */
	List<ExhibitObj> findByObjNmContainingOrObjWritrContaining(String objNm, String objWritr);

}
