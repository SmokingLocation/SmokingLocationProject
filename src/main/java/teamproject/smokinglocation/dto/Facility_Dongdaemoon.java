package teamproject.smokinglocation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facility_Dongdaemoon {
//    @JsonProperty("자치구")
    private String districtName="동대문구";
    @JsonProperty("주소")
    private String locationInDongdaemoon;
    @JsonProperty("위도")
    private String latitude; // 위도
    @JsonProperty("경도")
    private String longitude; // 경도
}
