package teamproject.smokinglocation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facility_Yongsan {
    @JsonProperty("자치구명")
    private String districtName; // 자치구명
    @JsonProperty("서울특별시 용산구 설치 위치")
    private String locationInYongsan; // 서울특별시 용산구 설치 위치
    @JsonProperty("위도")
    private String latitude; // 위도
    @JsonProperty("경도")
    private String longitude; // 경도
}
