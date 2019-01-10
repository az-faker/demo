package com.example.demo.controller;

import com.example.demo.domain.Team;
import com.example.demo.sevice.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * TeamController实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-09 15:53:19
 */
@RestController
@RequestMapping("/team")
public class TeamController {

    @Resource
    private TeamService teamService;

    @GetMapping("/list")
    public List<Team> list() {
        return teamService.list();
    }

    @GetMapping("/add")
    public int add(@RequestParam String name, @RequestParam Integer grade) {
        Team team = new Team();
        team.setName(name);
        team.setGrade(grade);
        return teamService.add(team);
    }
}
