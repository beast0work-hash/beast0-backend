package com.beastO.beastO_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.beastO.beastO_backend.DTO.BannerDTO;
import com.beastO.beastO_backend.service.BannerService;

import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/")
    public Map<String, Object> getHome() {
        return bannerService.getBanners();
    }

    @PostMapping("/banner")
    public BannerDTO createBanner(@RequestBody BannerDTO request) {
        return bannerService.createBanner(request);
    }
}
