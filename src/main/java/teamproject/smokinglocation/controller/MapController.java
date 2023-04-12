package teamproject.smokinglocation.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import teamproject.smokinglocation.dto.*;
import teamproject.smokinglocation.service.FetchData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MapController {
    public static final String  secretKey = "hWIiF1x6ClYGmxA62SIpOR476d8h0BZg9BTK288BLaIuLINJEvFOKU1CGk%2BQKg8Jr2DrdCX2jKFpxDe44YTYuQ%3D%3D";

    private final FetchData fetchData;

    @Value("${naver.map.client.id}")
    private String naverMapClientId;

    @GetMapping("/map/Yongsan")
    public String showMap_Yongsan(Model model) {
        List<Facility_Yongsan> facilities = fetchData.fetchData_Yongsan();
        model.addAttribute("facilities", facilities);

        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Gwangjin")
    public String showMap_Gwangjin(Model model) {
        List<Facility_Gwangjin> facilities = fetchData.fetchData_Gwangjin();
        model.addAttribute("facilities", facilities);

        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Youngdeungpo")
    public String showMap_Youngdeungpo(Model model) {
        List<Facility_Youngdeungpo> facilities = fetchData.fetchData_Youngdeungpo();
        model.addAttribute("facilities", facilities);

        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    /**
     * ================================여기까지는 @GetMapping(/map/...)=========================================
     * ================================아래부터는 @GetMapping(/get-data/...)====================================
     */

    @GetMapping("/get-data/Yongsan")
    @ResponseBody
    public List<Facility_Yongsan> fetchData_Yongsan() {
        return fetchData.fetchData_Yongsan();
    }

    @GetMapping("/get-data/Gwangjin")
    @ResponseBody
    public List<Facility_Gwangjin> fetchData_Gwangjin() {
        return fetchData.fetchData_Gwangjin();
    }

    @GetMapping("/get-data/Youngdeungpo")
    @ResponseBody
    public List<Facility_Youngdeungpo> fetchData_Youngdeungpo() {
        return fetchData.fetchData_Youngdeungpo();
    }
}

