package kaw.levelup.mmca.main.data.vo;

import java.time.LocalDate;

import kaw.levelup.mmca.main.data.entity.ExhibitObj;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public class ExhibitObjDTO {
	String objId;
	
	String objNm;
	
	String objWritr;
	
	byte[] objImg;
	
	LocalDate registDt;
	
	public ExhibitObjDTO() {}
	
	@Builder
	public ExhibitObjDTO(String objId, String objNm, String objWritr, byte[] objImg, LocalDate registDt) {
		this.objId = objId;
		this.objNm = objNm;
		this.objWritr = objWritr;
		this.objImg = objImg;
		this.registDt = registDt;
	}
	
	public ExhibitObj toEntity() {
		return ExhibitObj.builder()
				.objId(objId)
				.objNm(objNm)
				.objWritr(objWritr)
				.objImg(objImg)
				.registDt(registDt)
				.build();
	}
	
}
