package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.Team;
import com.example.springsecuritydemo.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<Team> getAll(){
        return repository.findAll();
    }

}
