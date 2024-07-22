package kaw.levelup.mmca.admin.data.vo;

import kaw.levelup.mmca.main.data.entity.MusumPlace;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// 프로그램 구분
public class PrgrmCdInfoDTO {
	
	char prgrm_cd;	// 프로그램 구분 코드 (001 : 전시, 002 : 교육, 003 : 이벤트)
	String prgrm_nm;	// 프로그램 명 (전시/교육/이벤트)
	
	@Builder
	public PrgrmCdInfoDTO(char prgrm_cd, String prgrm_nm) {
		this.prgrm_cd = prgrm_cd;
		this.prgrm_nm = prgrm_nm;
	}
	
	public PrgrmCdInfoDTO toEntity() {
		return PrgrmCdInfoDTO.builder()
				.prgrm_cd(prgrm_cd)
				.prgrm_nm(prgrm_nm)
				.build();
	}
	
}
