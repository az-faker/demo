package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ConfigBean实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 14:15:01
 */
@ConfigurationProperties(prefix = "faker")
@Component
@Getter
@Setter
@ToString
public class ConfigBean {
    private String name;
    private Integer age;
    private Integer number;
    private String uuid;
    private Integer max;
    private String value;
    private String greeting;

}
