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
public class Facility_Gwangjin {
//    @JsonProperty("자치구명")
    private String districtName="광진구";
    @JsonProperty("영업소소재지(도로 명)")
    private String locationInGwangjin;
    @JsonProperty("위도")
    private String latitude; // 위도
    @JsonProperty("경도")
    private String longitude; // 경도
}
