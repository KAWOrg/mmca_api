package kaw.levelup.mmca.main.data.entity;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import kaw.levelup.mmca.main.data.vo.MusumPlaceDTO;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "musum_place")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) 
@Builder
public class MusumPlace {
	
	@Id
	@Comment("시설 코드")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// id값 자동생성
	Long placeId;
	
	@Comment("시설종류 코드")
	@Column(length = 3, nullable = false)
	String placeTypeCd;	// 001: 편의시설 002: 문화시설
	
	@Comment("시설명")
	@Column(length = 50, nullable = false)
	String placeNm;
	
	@Comment("시설이미지")
	@Column(nullable = true, columnDefinition = "bytea") // 명시적으로 bytea로 지정
	byte[] imageFile;
	
	@Comment("내용")
	@Column(nullable = true)
	String placeDscrp;
	
	@Comment("미술관 코드")
	@Column(length = 3, nullable = true)
	String musumCd;
	
	public MusumPlaceDTO toDTO() {
		return MusumPlaceDTO.builder()
				.placeId(placeId)
				.placeTypeCd(placeTypeCd)
				.placeNm(placeNm)
				.placeDscrp(placeDscrp)
				.musumCd(musumCd)
				.imageBytes(imageFile)
				.build();
	}
}
