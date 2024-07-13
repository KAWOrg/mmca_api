package kaw.levelup.mmca.main.data.entity;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kaw.levelup.mmca.main.data.vo.MusumInfoVO;
import lombok.Data;
import lombok.Getter;

@Entity
@Getter
@Table(name = "musum_info")
public class MusumInfo {
	
	@Id
	@Comment("미술관코드")
	@Column(length = 3, nullable = false)
	String musumCode;
	
	@Comment("미술관명")
	@Column(length = 10, nullable = false)
	String musumNm;
	
	@Comment("주소")
	@Column(length = 300, nullable = false)
	String musumAddr;
	
	@Comment("우편번호")
	@Column(length = 5, nullable = false)
	String musumMailAddr;
	
	@Comment("전화번호")
	@Column(length = 11, nullable = false)
	String musumTel;
	
	public MusumInfoVO toVO() {
		return MusumInfoVO.builder()
				.musumCode(musumCode)
				.musumNm(musumNm)
				.musumAddr(musumAddr)
				.musumMailAddr(musumMailAddr)
				.musumTel(musumTel)
				.build();
	}
}