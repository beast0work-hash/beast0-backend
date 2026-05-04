package com.beastO.beastO_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beastO.beastO_backend.DTO.BannerDTO;
import com.beastO.beastO_backend.model.Banner;
import com.beastO.beastO_backend.repository.BannerRepository;

import java.util.List;
import java.util.Map;

@Service
public class BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    public Map<String, Object> getBanners() {
        List<BannerDTO> banners = bannerRepository.findAll()
                .stream()
                .map(b -> new BannerDTO(
                        b.getId(),
                        b.getImage(),
                        b.getResponsiveImg()))
                .toList();

        return Map.of("banners", banners);
    }

    public BannerDTO createBanner(BannerDTO request) {

        Banner banner = new Banner();
        banner.setImage(request.getImage());
        banner.setResponsiveImg(request.getResponsiveImg());

        Banner saved = bannerRepository.save(banner);

        return new BannerDTO(
                saved.getId(),
                saved.getImage(),
                saved.getResponsiveImg());
    }
}