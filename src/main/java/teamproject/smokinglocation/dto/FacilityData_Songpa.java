package teamproject.smokinglocation.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class FacilityData_Songpa {
    private int currentCount;
    private List<Facility_Songpa> data;
    private int matchCount;
    private int page;
    private int perPage;
    private int totalCount;
}
