package kaw.levelup.mmca.admin.data.vo;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
// 프로그램
public class ProgramDTO {

	String prgrmId;
	String prgrmTitle;	// 프로그램 제목
	String prgrmStrtDt;	// 프로그램 시작일
	String prgrmEndDt;	// 프로그램 종료일
	int prgrmPrice;	// 비용
	int maxPtcp;	// 현장 관람정원
	int onlinMaxPtcp;	// 온라인 관람정원
	byte[] thbnail;	// 썸네일
	String prgrmDscrp;	// 내용
	String registDt;	// 등록일자
	int viewCnt;	// 조회수
	String prgrmLoca;	// 장소	
	String prgrmHost;	// 주최/후원
	String prgrmTarget;	//대상
	String relatExhbt;	// 관련전시
	String prgrmStrtTime;	// 프로그램 시작 시간
	String prgrmEndTime;	// 프로그램 종료 시간
	char prgrmCd;	// 프로그램 구분코드
	char musumCd;	// 미술관 코드
	
	/*
	 * @Builder public ProgramDTO(String prgrmId, String prgrmTitle, Date
	 * prgrmStrtDt, Date prgrmEndDt, int prgrmPrice, int maxPtcp, int onlinMaxPtcp,
	 * byte[] thbnail, String prgrmDscrp, Timestamp registDt, int viewCnt, String
	 * prgrmLoca, String prgrmHost, String prgrmTarget, String relatExhbt, Time
	 * prgrmStrtTime, Time prgrmEndTime, char prgrmCd, char musumCd) { this.prgrmId
	 * = prgrmId; this.prgrmTitle = prgrmTitle; this.prgrmStrtDt = prgrmStrtDt;
	 * this.prgrmEndDt = prgrmEndDt; this.prgrmPrice = prgrmPrice; this.maxPtcp =
	 * maxPtcp; this.onlinMaxPtcp = onlinMaxPtcp; this.thbnail = thbnail;
	 * this.prgrmDscrp = prgrmDscrp; this.registDt = registDt; this.viewCnt =
	 * viewCnt; this.prgrmLoca = prgrmLoca; this.prgrmHost = prgrmHost;
	 * this.prgrmTarget = prgrmTarget; this.relatExhbt = relatExhbt;
	 * this.prgrmStrtTime = prgrmStrtTime; this.prgrmEndTime = prgrmEndTime;
	 * this.prgrmCd = prgrmCd; this.musumCd = musumCd; }
	 * 
	 * public ProgramDTO toEntity() { return ProgramDTO.builder() .prgrmId(prgrmId)
	 * .prgrmTitle(prgrmTitle) .prgrmStrtDt(prgrmStrtDt) .prgrmEndDt(prgrmEndDt)
	 * .prgrmPrice(prgrmPrice) .maxPtcp(maxPtcp) .onlinMaxPtcp(onlinMaxPtcp)
	 * .thbnail(thbnail) .prgrmDscrp(prgrmDscrp) .registDt(registDt)
	 * .viewCnt(viewCnt) .prgrmLoca(prgrmLoca) .prgrmHost(prgrmHost)
	 * .prgrmTarget(prgrmTarget) .relatExhbt(relatExhbt)
	 * .prgrmStrtTime(prgrmStrtTime) .prgrmEndTime(prgrmEndTime) .prgrmCd(prgrmCd)
	 * .musumCd(musumCd) .build(); }
	 */
	
}
