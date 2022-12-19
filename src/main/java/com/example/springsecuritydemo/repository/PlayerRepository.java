package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player ,Integer> {
}
