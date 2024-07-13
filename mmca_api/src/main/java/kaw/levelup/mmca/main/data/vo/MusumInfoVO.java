package kaw.levelup.mmca.main.data.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class MusumInfoVO {
	
	String musumCode;
	String musumNm;
	String musumAddr;
	String musumMailAddr;
	String musumTel;
}