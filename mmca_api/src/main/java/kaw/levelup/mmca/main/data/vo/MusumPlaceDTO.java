package kaw.levelup.mmca.main.data.vo;

import kaw.levelup.mmca.main.data.entity.MusumPlace;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 무분별한 객체 생성에 대해 한번 더 체크할 수 있는 수단
//@Builder
public class MusumPlaceDTO {
	
	Long placeId;
	
	String placeTypeCd;	// 001: 편의시설 002: 문화시설

	String placeNm;

	byte[] imageFile;

	String placeDscrp;

	String musumCd;
	
	
	// 클래스 자체에 @Builder 어노테이션을 주는 것보다 원하는 컬럼만 선택해서 builder를 생성하는게 바람직함
	// 주의 : builder 패턴을 사용할 때 Class가 타겟일 경우에는 일치하는 생성자를 찾을 수 없어서 @NoArgsConstructor를 함께 써야함
	@Builder
	public MusumPlaceDTO(Long placeId, String placeTypeCd, String placeNm, String placeDscrp, String musumCd) {
		this.placeId = placeId;
		this.placeTypeCd = placeTypeCd;
		this.placeNm = placeNm;
		this.placeDscrp = placeDscrp;
		this.musumCd = musumCd;
	}
	
	public MusumPlace toEntity() {
		return MusumPlace.builder()
				.placeId(placeId)
				.placeTypeCd(placeTypeCd)
				.placeNm(placeNm)
				.placeDscrp(placeDscrp)
				.musumCd(musumCd)
				.build();
	}
}