package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.model.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor,Integer> {
}
