package kaw.levelup.mmca.main.data.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MusumPlaceVO {
	
	int placeId;
	
	String placeTypeCd;	// 001: 편의시설 002: 문화시설

	String placeNm;

	byte[] imageFile;

	String placeDscrp;

	String musumCd;
	
	@Builder
	public MusumPlaceVO(int placeId, String placeTypeCd, String placeNm, String placeDscrp, String musumCd) {
		this.placeId = placeId;
		this.placeTypeCd = placeTypeCd;
		this.placeNm = placeNm;
		this.placeDscrp = placeDscrp;
		this.musumCd = musumCd;
		
	}
	
//	public MusumPlace toEntity() {
//		return MusumPlace.builder()
//				.placeId(placeId)
//				.placeTypeCd(placeTypeCd)
//				.placeNm(placeNm)
//				.placeDscrp(placeDscrp)
//				.musumCd(musumCd)
//				.build();
//	}
}
