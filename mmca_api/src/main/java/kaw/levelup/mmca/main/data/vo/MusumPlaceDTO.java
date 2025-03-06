package kaw.levelup.mmca.main.data.vo;

import jakarta.persistence.Lob;
import kaw.levelup.mmca.main.data.entity.MusumPlace;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.coobird.thumbnailator.Thumbnails;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

@Data
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 무분별한 객체 생성에 대해 한번 더 체크할 수 있는 수단
//@Builder
public class MusumPlaceDTO {
	
	Long placeId;
	
	String placeTypeCd;	// 001: 편의시설 002: 문화시설

	String placeNm;
	
	List<MultipartFile> imageFile;

	String placeDscrp;

	String musumCd;
	
	byte[] imageBytes;	// 사진 조회용
	
	
	// 클래스 자체에 @Builder 어노테이션을 주는 것보다 원하는 컬럼만 선택해서 builder를 생성하는게 바람직함
	// 주의 : builder 패턴을 사용할 때 Class가 타겟일 경우에는 일치하는 생성자를 찾을 수 없어서 @NoArgsConstructor를 함께 써야함
	@Builder
	public MusumPlaceDTO(Long placeId, String placeTypeCd, String placeNm, List<MultipartFile> imageFile, String placeDscrp, String musumCd, byte[] imageBytes) {
		this.placeId = placeId;
		this.placeTypeCd = placeTypeCd;
		this.placeNm = placeNm;
		this.placeDscrp = placeDscrp;
		this.musumCd = musumCd;
		this.imageFile = imageFile;
		this.imageBytes = imageBytes;
	}
	
	public MusumPlace toEntity() {
		byte[] imageBytes = null;
		
		if(imageFile != null  && !imageFile.isEmpty()) {
			try {
				// 첫 번째 파일 가져오기
				//imageBytes = imageFile.get(0).getBytes();
				
				MultipartFile file = imageFile.get(0);
				
				// 이미지 압축 (품질 60%로 설정)
	            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	            InputStream inputStream = file.getInputStream();
	            Thumbnails.of(inputStream)
	                    .size(800, 800)  // 최대 크기 설정
	                    .outputQuality(0.6)  // 품질 설정 (0.0 ~ 1.0)
	                    .toOutputStream(outputStream);
	            
	            imageBytes = outputStream.toByteArray();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		return MusumPlace.builder()
				.placeId(placeId)
				.placeTypeCd(placeTypeCd)
				.placeNm(placeNm)
				.imageFile(imageBytes)
				.placeDscrp(placeDscrp)
				.musumCd(musumCd)
				.build();
	}
	
}
