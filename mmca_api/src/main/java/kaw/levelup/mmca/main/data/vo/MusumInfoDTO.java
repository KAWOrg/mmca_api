package kaw.levelup.mmca.main.data.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MusumInfoDTO {
	
	String musumCd;
	String musumNm;
	String musumAddr;
	String musumMailAddr;
	String musumTel;
}