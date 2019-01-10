package com.example.demo.sevice;

import com.example.demo.domain.Team;

import java.util.List;

/**
 * TeamService实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-09 15:50:45
 */
public interface TeamService {
    int add(Team team);

    List<Team> list();
}
