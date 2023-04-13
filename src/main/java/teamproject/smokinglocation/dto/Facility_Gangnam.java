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
public class Facility_Gangnam {
//    @JsonProperty("자치구")
    private String districtName="강남구";
    @JsonProperty("설치주소")
    private String locationInGangnam;
    @JsonProperty("위도")
    private String latitude; // 위도
    @JsonProperty("경도")
    private String longitude; // 경도
}
