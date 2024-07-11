package kaw.levelup.mmca.main.data.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusumInfoVO {
	
	String musumCode;
	String musumNm;
	String musumAddr;
	String musumMailAddr;
	String musumTel;
}