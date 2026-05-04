package com.beastO.beastO_backend.DTO;

public class BannerDTO {

    private Long id;
    private String image;
    private String responsiveImg;

    public BannerDTO(Long id, String image, String responsiveImg) {
        this.id = id;
        this.image = image;
        this.responsiveImg = responsiveImg;
    }

    public Long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getResponsiveImg() {
        return responsiveImg;
    }

}
