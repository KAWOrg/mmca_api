package kaw.levelup.mmca.admin.data.vo;

import kaw.levelup.mmca.main.data.entity.MusumPlace;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// 전시품목
public class ObjExhbtDTO {
	
	String objExhbtSn;	// 전시품목 id
	String objExhbtId;	// 전시id
	String objId;	// 작품id
	
	@Builder
	public ObjExhbtDTO(String objExhbtSn, String objExhbtId, String objId) {
		this.objExhbtSn = objExhbtSn;
		this.objExhbtId = objExhbtId;
		this.objId = objId;
	}
	
	public ObjExhbtDTO toEntity() {
		return ObjExhbtDTO.builder()
				.objExhbtSn(objExhbtSn)
				.objExhbtId(objExhbtId)
				.objId(objId)
				.build();
	}
	
}
