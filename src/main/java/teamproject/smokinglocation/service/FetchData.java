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

    public List<Facility_Joong> fetchData_Joong() {
        List<Facility_Joong> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15080296/v1/uddi:87a3b7f3-fa03-4345-8001-b0fb950a1ab1?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Joong facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Joong.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Joong facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInJoong());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Gangseo> fetchData_Gangseo() {
        List<Facility_Gangseo> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15068987/v1/uddi:92996e84-3919-4fc6-a751-a57aaf48f0f3?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Gangseo facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Gangseo.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Gangseo facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInGangseo());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Songpa> fetchData_Songpa() {
        List<Facility_Songpa> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15067591/v1/uddi:abd3c39d-796a-4433-b298-e1f1cb4e2540?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Songpa facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Songpa.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Songpa facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInSongpa());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Seodaemoon> fetchData_Seodaemoon() {
        List<Facility_Seodaemoon> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15040413/v1/uddi:280fb8c7-7bd8-4633-896e-99a76d23d2de?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Seodaemoon facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Seodaemoon.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Seodaemoon facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInSeodaemoon());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Joonglang> fetchData_Joonglang() {
        List<Facility_Joonglang> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15040636/v1/uddi:4250aae2-a50a-4a5d-8d70-9ec4c55a92f3?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Joonglang facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Joonglang.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Joonglang facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInJoonglang());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Yangcheon> fetchData_Yangcheon() {
        List<Facility_Yangcheon> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15040511/v1/uddi:c88f8999-4362-4eb0-8a69-b8c4dc7e243a?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Yangcheon facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Yangcheon.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Yangcheon facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInYangcheon());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Dongjak> fetchData_Dongjak() {
        List<Facility_Dongjak> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15049031/v1/uddi:03e47093-48b5-442c-a6a5-bd756148f6ae?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Dongjak facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Dongjak.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Dongjak facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInDongjak());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Gwanak> fetchData_Gwanak() {
        List<Facility_Gwanak> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15040591/v1/uddi:3d363ba6-3fcf-49af-8689-92b2a77d1c69?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Gwanak facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Gwanak.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Gwanak facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInGwanak());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Dongdaemoon> fetchData_Dongdaemoon() {
        List<Facility_Dongdaemoon> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15070168/v1/uddi:aef69bb4-d848-4088-9abd-f6e3dd361cfb?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Dongdaemoon facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Dongdaemoon.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Dongdaemoon facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInDongdaemoon());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Guro> fetchData_Guro() {
        List<Facility_Guro> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15069274/v1/uddi:6e9ed9bd-b5ad-4188-9bbe-f9516113ddf4?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Guro facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Guro.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Guro facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInGuro());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Gangbook> fetchData_Gangbook() {
        List<Facility_Gangbook> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15049030/v1/uddi:0d7a603a-608e-481a-8ff0-a4cd23d7c449?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Gangbook facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Gangbook.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Gangbook facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInGangbook());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

     public List<Facility_Sungdong> fetchData_Sungdong() {
        List<Facility_Sungdong> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15029169/v1/uddi:68c14d9d-6a3c-4cd6-9199-959ef803e3f3_201908021643?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Sungdong facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Sungdong.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Sungdong facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInSungdong());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Seocho> fetchData_Seocho() {
        List<Facility_Seocho> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15074379/v1/uddi:16735cd3-6305-4539-b0b4-e92ad6653ec7?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Seocho facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Seocho.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Seocho facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInSeocho());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Sungbook> fetchData_Sungbook() {
        List<Facility_Sungbook> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15103853/v1/uddi:d0bd14d5-4a72-4926-9c7d-d19b9440162f?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Sungbook facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Sungbook.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Sungbook facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInSungbook());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Nowon> fetchData_Nowon() {
        List<Facility_Nowon> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15078097/v1/uddi:21993e35-919a-4241-9220-a4828c5d9d96?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Nowon facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Nowon.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Nowon facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInNowon());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Gangnam> fetchData_Gangnam() {
        List<Facility_Gangnam> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15103349/v1/uddi:06daef13-9cbe-463d-b7b4-b80b1b3ab815?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Gangnam facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Gangnam.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Gangnam facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInGangnam());
                log.info(facility.getLatitude());
                log.info(facility.getLongitude());
                log.info("==================================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return facilities;
    }

    public List<Facility_Jongro> fetchData_Jongro() {
        List<Facility_Jongro> facilities = new ArrayList<>();

        String apiUrl = "https://api.odcloud.kr/api/15102250/v1/uddi:8d03feef-5b39-435d-b423-9f9842bfdce3?page=1&perPage=10&serviceKey=dP9ZxjdllWOjmt5zzJVCVHUHXysykcUWsLPHbnfHrf3JcOK2zEo60B3iOrILphRT5xRc865itVYu9KAlGGEyLw%3D%3D";

        try {
            FacilityData_Jongro facilityData = objectMapper.readValue(getConnection(apiUrl), FacilityData_Jongro.class);
            facilities.addAll(facilityData.getData());
            for (Facility_Jongro facility : facilities) {
                log.info("==================================");
                log.info(facility.getDistrictName());
                log.info(facility.getLocationInJongro());
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
