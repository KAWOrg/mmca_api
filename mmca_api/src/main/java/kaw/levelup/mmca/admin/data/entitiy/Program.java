package kaw.levelup.mmca.admin.data.entitiy;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kaw.levelup.mmca.admin.data.vo.ProgramDTO;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@Table(name="prgrm_list")
public class Program {
	
	@Id
	@Column(length = 10, nullable = false)
	@Comment("프로그램 id")
	String prgrmId;
	
	@Column(length = 100, nullable = false)
	@Comment("프로그램 제목")
	String prgrmTitle;
	
	@Column(nullable = false)
	@Comment("프로그램 시작일")
	String prgrmStrtDt;
	
	@Column(nullable = false)
	@Comment("프로그램 종료일")
	String prgrmEndDt;
	
	@Column(length = 100, nullable = false)
	@Comment("비용")
	int prgrmPrice;
	
	@Column(length = 500, nullable = false)
	@Comment("현장 관람정원")
	int maxPtcp;
	
	@Column(length = 500, nullable = false)
	@Comment("온라인 관람정원")
	int onlinMaxPtcp;
	
	@Column(nullable = false)
	@Comment("썸네일")
	byte[] thbnail;
	
	@Column(length = 300, nullable = false)
	@Comment("내용")
	String prgrmDscrp;
	
	@Column(nullable = false)
	@Comment("등록일자")
	String registDt;
	
	@Column(length = 100, nullable = false)
	@Comment("조회수")
	int viewCnt;
	
	@Column(length = 500, nullable = false)
	@Comment("장소")
	String prgrmLoca;
	
	@Column(length = 500, nullable = false)
	@Comment("주최/후원")
	String prgrmHost;
	
	@Column(length = 500, nullable = false)
	@Comment("대상")
	String prgrmTarget;
	
	@Column(length = 500, nullable = false)
	@Comment("관련전시")
	String relatExhbt;
	
	@Column(nullable = false)
	@Comment("프로그램 시작 시간")
	String prgrmStrtTime;
	
	@Column(nullable = false)
	@Comment("프로그램 종료 시간")
	String prgrmEndTime;
	
	@Column(length = 30, nullable = false)
	@Comment("프로그램 구분코드")
	char prgrmCd;
	
	@Column(length = 30, nullable = false)
	@Comment("미술관 코드")
	char musumCd;
	
	
	public ProgramDTO toDTO() {
		return ProgramDTO.builder().
				prgrmId(prgrmId).
				prgrmTitle(prgrmTitle).
				prgrmStrtDt(prgrmStrtDt).
				prgrmEndDt(prgrmEndDt).
				prgrmPrice(prgrmPrice).
				maxPtcp(maxPtcp).
				onlinMaxPtcp(onlinMaxPtcp).
				thbnail(thbnail).
				prgrmDscrp(prgrmDscrp).
				registDt(registDt).
				viewCnt(viewCnt).
				prgrmLoca(prgrmLoca).
				prgrmHost(prgrmHost).
				prgrmTarget(prgrmTarget).
				relatExhbt(relatExhbt).
				prgrmStrtTime(prgrmStrtTime).
				prgrmEndTime(prgrmEndTime).
				prgrmCd(prgrmCd).
				musumCd(musumCd).
				build();
	}
	
}
