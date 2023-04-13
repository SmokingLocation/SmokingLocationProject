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

    @GetMapping("/map/Joong")
    public String showMap_Joong(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Joong());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Gangseo")
    public String showMap_Gangseo(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Gangseo());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Songpa")
    public String showMap_Songpa(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Songpa());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Seodaemoon")
    public String showMap_Seodaemoon(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Seodaemoon());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Joonglang")
    public String showMap_Joonglang(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Joonglang());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Yangcheon")
    public String showMap_Yangcheon(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Yangcheon());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Dongjak")
    public String showMap_Dongjak(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Dongjak());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Gwanak")
    public String showMap_Gwanak(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Gwanak());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Dongdaemoon")
    public String showMap_Dongdaemoon(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Dongdaemoon());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Guro")
    public String showMap_Guro(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Guro());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Gangbook")
    public String showMap_Gangbook(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Gangbook());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Sungdong")
    public String showMap_Sungdong(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Sungdong());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Seocho")
    public String showMap_Seocho(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Seocho());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Sungbook")
    public String showMap_Sungbook(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Sungbook());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Nowon")
    public String showMap_Nowon(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Nowon());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Gangnam")
    public String showMap_Gangnam(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Gangnam());
        model.addAttribute("naverMapClientId",naverMapClientId);
        return "map";
    }

    @GetMapping("/map/Jongro")
    public String showMap_Jongro(Model model) {
        model.addAttribute("facilities", fetchData.fetchData_Jongro());
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

    @GetMapping("/get-data/Joong")
    @ResponseBody
    public List<Facility_Joong> fetchData_Joong() {
        return fetchData.fetchData_Joong();
    }

    @GetMapping("/get-data/Gangseo")
    @ResponseBody
    public List<Facility_Gangseo> fetchData_Gangseo() {
        return fetchData.fetchData_Gangseo();
    }

    @GetMapping("/get-data/Songpa")
    @ResponseBody
    public List<Facility_Songpa> fetchData_Songpa() {
        return fetchData.fetchData_Songpa();
    }

    @GetMapping("/get-data/Seodaemoon")
    @ResponseBody
    public List<Facility_Seodaemoon> fetchData_Seodaemoon() {
        return fetchData.fetchData_Seodaemoon();
    }

    @GetMapping("/get-data/Joonglang")
    @ResponseBody
    public List<Facility_Joonglang> fetchData_Joonglang() {
        return fetchData.fetchData_Joonglang();
    }

    @GetMapping("/get-data/Yangcheon")
    @ResponseBody
    public List<Facility_Yangcheon> fetchData_Yangcheon() {
        return fetchData.fetchData_Yangcheon();
    }

    @GetMapping("/get-data/Dongjak")
    @ResponseBody
    public List<Facility_Dongjak> fetchData_Dongjak() {
        return fetchData.fetchData_Dongjak();
    }

    @GetMapping("/get-data/Gwanak")
    @ResponseBody
    public List<Facility_Gwanak> fetchData_Gwanak() {
        return fetchData.fetchData_Gwanak();
    }

    @GetMapping("/get-data/Dongdaemoon")
    @ResponseBody
    public List<Facility_Dongdaemoon> fetchData_Dongdaemoon() {
        return fetchData.fetchData_Dongdaemoon();
    }

    @GetMapping("/get-data/Guro")
    @ResponseBody
    public List<Facility_Guro> fetchData_Guro() {
        return fetchData.fetchData_Guro();
    }

    @GetMapping("/get-data/Gangbook")
    @ResponseBody
    public List<Facility_Gangbook> fetchData_Gangbook() {
        return fetchData.fetchData_Gangbook();
    }

    @GetMapping("/get-data/Sungdong")
    @ResponseBody
    public List<Facility_Sungdong> fetchData_Sungdong() {
        return fetchData.fetchData_Sungdong();
    }

    @GetMapping("/get-data/Seocho")
    @ResponseBody
    public List<Facility_Seocho> fetchData_Seocho() {
        return fetchData.fetchData_Seocho();
    }

    @GetMapping("/get-data/Sungbook")
    @ResponseBody
    public List<Facility_Sungbook> fetchData_Sungbook() {
        return fetchData.fetchData_Sungbook();
    }

    @GetMapping("/get-data/Nowon")
    @ResponseBody
    public List<Facility_Nowon> fetchData_Nowon() {
        return fetchData.fetchData_Nowon();
    }

    @GetMapping("/get-data/Gangnam")
    @ResponseBody
    public List<Facility_Gangnam> fetchData_Gangnam() {
        return fetchData.fetchData_Gangnam();
    }

    @GetMapping("/get-data/Jongro")
    @ResponseBody
    public List<Facility_Jongro> fetchData_Jongro() {
        return fetchData.fetchData_Jongro();
    }

}

