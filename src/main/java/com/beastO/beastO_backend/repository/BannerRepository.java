package com.beastO.beastO_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beastO.beastO_backend.model.Banner;

public interface BannerRepository extends JpaRepository<Banner, Long> {
}