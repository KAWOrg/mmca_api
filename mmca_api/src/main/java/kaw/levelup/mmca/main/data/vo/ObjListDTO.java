package kaw.levelup.mmca.main.data.vo;

import java.sql.Date;

import kaw.levelup.mmca.main.data.entity.MusumPlace;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// 작품
public class ObjListDTO {
	
	String objId;	// 작품id
	String objNm;	// 작품명
	String objWritr;	// 작가
	Date registDt;	// 제작년도
	
	@Builder
	public ObjListDTO(String objId, String objNm, String objWritr, Date registDt) {
		this.objId = objId;
		this.objNm = objNm;
		this.objWritr = objWritr;
		this.registDt = registDt;
	}
	
	public ObjListDTO toEntity() {
		return ObjListDTO.builder()
				.objId(objId)
				.objNm(objNm)
				.objWritr(objWritr)
				.registDt(registDt)
				.build();
	}
	
}
