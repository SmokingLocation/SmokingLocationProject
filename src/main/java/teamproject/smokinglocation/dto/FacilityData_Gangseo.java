package teamproject.smokinglocation.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class FacilityData_Gangseo {
    private int currentCount;
    private List<Facility_Gangseo> data;
    private int matchCount;
    private int page;
    private int perPage;
    private int totalCount;
}
