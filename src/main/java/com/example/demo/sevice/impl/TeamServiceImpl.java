package com.example.demo.sevice.impl;

import com.example.demo.dao.TeamDao;
import com.example.demo.domain.Team;
import com.example.demo.sevice.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * TeamServiceImpl实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-09 15:51:32
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Resource
    private TeamDao teamDao;

    @Override
    public int add(Team team) {
        return teamDao.add(team.getName(), team.getGrade());
    }

    @Override
    public List<Team> list() {
        return teamDao.all();
    }
}
