package com.example.demo.dao;

import com.example.demo.domain.Team;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * TeamDao实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-09 15:46:06
 */
@Mapper
public interface TeamDao {
    @Insert("insert into team(name, grade) values(#{name}, #{grade})")
    int add(@Param("name")String name, @Param("grade")Integer grade);

    @Select("select * from team")
    List<Team> all();
}
