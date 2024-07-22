package kaw.levelup.mmca.admin.data.vo;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// 프로그램
public class ProgramDTO {

	String prgrmId;
	String prgrmTitle;	// 프로그램 제목
	Date prgrmStrtDt;	// 프로그램 시작일
	Date prgrmEndDt;	// 프로그램 종료일
	int prgrm_price;	// 비용
	int max_ptcp;	// 현장 관람정원
	int onlin_max_ptcp;	// 온라인 관람정원
	byte[] thbnail;	// 썸네일
	String prgrm_dscrp;	// 내용
	Timestamp regist_dt;	// 등록일자
	int view_cnt;	// 조회수
	String prgrm_loca;	// 장소	
	String prgrm_host;	// 주최/후원
	String prgrm_target;	//대상
	String relat_exhbt;	// 관련전시
	Time prgrm_strt_time;	// 프로그램 시작 시간
	Time prgrm_end_time;	// 프로그램 종료 시간
	char prgrm_cd;	// 프로그램 구분코드
	char musum_cd;	// 미술관 코드
	
	
	@Builder
	public ProgramDTO(String prgrm_id, String prgrm_title, Date prgrm_strt_dt, Date prgrm_end_dt, int prgrm_price,
			int max_ptcp, int onlin_max_ptcp, byte[] thbnail, String prgrm_dscrp, Timestamp regist_dt, int view_cnt,
			String prgrm_loca, String prgrm_host, String prgrm_target, String relat_exhbt, Time prgrm_strt_time,
			Time prgrm_end_time, char prgrm_cd, char musum_cd) {
		this.prgrm_id = prgrm_id;
		this.prgrm_title = prgrm_title;
		this.prgrm_strt_dt = prgrm_strt_dt;
		this.prgrm_end_dt = prgrm_end_dt;
		this.prgrm_price = prgrm_price;
		this.max_ptcp = max_ptcp;
		this.onlin_max_ptcp = onlin_max_ptcp;
		this.thbnail = thbnail;
		this.prgrm_dscrp = prgrm_dscrp;
		this.regist_dt = regist_dt;
		this.view_cnt = view_cnt;
		this.prgrm_loca = prgrm_loca;
		this.prgrm_host = prgrm_host;
		this.prgrm_target = prgrm_target;
		this.relat_exhbt = relat_exhbt;
		this.prgrm_strt_time = prgrm_strt_time;
		this.prgrm_end_time = prgrm_end_time;
		this.prgrm_cd = prgrm_cd;
		this.musum_cd = musum_cd;
	}
	
	
	public ProgramDTO toEntity() {
		return ProgramDTO.builder().
				prgrm_id(prgrm_id).
				prgrm_title(prgrm_title).
				prgrm_strt_dt(prgrm_strt_dt).
				prgrm_end_dt(prgrm_end_dt).
				prgrm_price(prgrm_price).
				max_ptcp(max_ptcp).
				onlin_max_ptcp(onlin_max_ptcp).
				thbnail(thbnail).
				prgrm_dscrp(prgrm_dscrp).
				regist_dt(regist_dt).
				view_cnt(view_cnt).
				prgrm_loca(prgrm_loca).
				prgrm_host(prgrm_host).
				prgrm_target(prgrm_target).
				relat_exhbt(relat_exhbt).
				prgrm_strt_time(prgrm_strt_time).
				prgrm_end_time(prgrm_end_time).
				prgrm_cd(prgrm_cd).
				musum_cd(musum_cd).
				build();
	}
	
	
	
	
	
}
