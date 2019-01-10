package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * ConfigCom实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 14:55:53
 */
@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.faker")
@Getter
@Setter
public class ConfigCom {
    private String name;
    private Integer age;

}
