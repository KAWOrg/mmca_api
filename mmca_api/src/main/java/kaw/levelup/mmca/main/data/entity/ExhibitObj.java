package kaw.levelup.mmca.main.data.entity;

import java.time.LocalDate;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import kaw.levelup.mmca.main.data.vo.ExhibitObjDTO;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/** 전시 등록 > 전시품 등록 > 전시품 조회
 * @author hsoo3
 *
 */
@Entity
@Getter
@Table(name = "obj_list")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) 
@Builder
public class ExhibitObj {

	@Id
	@Comment("작품 ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String objId;
	
	@Comment("작품명")
	@Column(length = 300, nullable = false)
	String objNm;
	
	@Comment("작가")
	@Column(length = 100, nullable = false)
	String objWritr;
	
	@Comment("대표 이미지")
	@Column(nullable = false, columnDefinition = "bytea")
	@Lob
	byte[] objImg;
	
	@Comment("제작연도")
	@Column(nullable = false)
	LocalDate registDt;

	public ExhibitObjDTO toDTO() {
		return ExhibitObjDTO.builder()
				.objId(objId)
				.objNm(objNm)
				.objWritr(objWritr)
				.objImg(objImg)
				.registDt(registDt)
				.build();
	}
	
	
}
