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
public class Facility_Youngdeungpo {
    @JsonProperty("자치구")
    private String districtName;
    @JsonProperty("시설 구분")
    private String locationInYoungdeungpo;
    @JsonProperty("위도")
    private String latitude; // 위도
    @JsonProperty("경도")
    private String longitude; // 경도
}
