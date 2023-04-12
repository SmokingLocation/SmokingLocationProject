package teamproject.smokinglocation.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import teamproject.smokinglocation.dto.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FetchData {

    private final ObjectMapper objectMapper;

    public List<Facility_Gwangjin> fetchData_Gwangjin() {
        List<Facility_Gwangjin> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15040615/v1/uddi:d494c578-f45e-4c42-9dde-c277cbd8717a?page=1&perPage=268&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Gwangjin facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Gwangjin.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Gwangjin facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInGwangjin());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return facilities;
    }

    public List<Facility_Yongsan> fetchData_Yongsan() {
        List<Facility_Yongsan> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15073796/v1/uddi:17fbd06c-45bb-48aa-9be7-b26dbc708c9c?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Yongsan facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Yongsan.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Yongsan facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInYongsan());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return facilities;
    }

    public List<Facility_Youngdeungpo> fetchData_Youngdeungpo() {
        List<Facility_Youngdeungpo> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15069051/v1/uddi:2653cc01-60d7-4e8b-81f4-80b24a39d8f6?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Youngdeungpo facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Youngdeungpo.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Youngdeungpo facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInYoungdeungpo());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    private String getConnection(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        conn.disconnect();

        String jsonString = response.toString();
        return jsonString;
    }


}
