package com.marvel.marvel_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marvel.marvel_api.Models.Hero;

public interface HeroRepository extends JpaRepository <Hero, Long> {

}
