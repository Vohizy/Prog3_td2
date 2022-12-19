package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Team;
import com.example.springsecuritydemo.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;

    @GetMapping("/team")
    public List<Team> getAll(){
        return service.getAll();
    }

}
