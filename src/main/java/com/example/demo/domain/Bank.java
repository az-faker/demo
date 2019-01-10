package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Bank实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-08 10:19:51
 */
@Entity
@Getter
@Setter
public class Bank {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String phone;
}
