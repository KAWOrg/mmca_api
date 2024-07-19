package kaw.levelup.mmca.main.data.vo;

import kaw.levelup.mmca.main.data.entity.MusumPlace;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 무분별한 객체 생성에 대해 한번 더 체크할 수 있는 수단
/* JPA가 객체를 생성해서 값을 주입할 때, 기본 생성자로 객체 생성 한 후에 값을 매핑함
 따라서 JPA를 쓰려면 Entity로 사용되는 클래스에 @NoArgsConstructor 필수 */
public class MusumPlaceDTO {
	
	Long placeId;
	
	String placeTypeCd;	// 001: 편의시설 002: 문화시설

	String placeNm;

	byte[] imageFile;

	String placeDscrp;

	String musumCd;
	
	
	// 클래스 자체에 @Builder 어노테이션을 주는 것보다 원하는 컬럼만 선택해서 builder를 생성하는게 바람직함
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
