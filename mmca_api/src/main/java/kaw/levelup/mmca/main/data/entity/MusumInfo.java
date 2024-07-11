package kaw.levelup.mmca.main.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "musum_info")
public class MusumInfo {
	
	@Id
	String musumCode;
	String musumNm;
	String musumAddr;
	String musumMailAddr;
	String musumTel;
}