package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * PersonForm实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-09 17:25:54
 */
@Getter
@Setter
@ToString
public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;
}
