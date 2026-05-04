package com.beastO.beastO_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "banners")
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    @Column(name = "responsive_img")
    private String responsiveImg;

    // GETTERS & SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getResponsiveImg() {
        return responsiveImg;
    }

    public void setResponsiveImg(String responsiveImg) {
        this.responsiveImg = responsiveImg;
    }
}
