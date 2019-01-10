package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Team实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 15:12:50
 */
@Getter
@Setter
public class Team {
    private Long id;
    private String name;
    private Integer grade;
}
