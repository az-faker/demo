package com.example.demo.controller.test;

import com.example.demo.config.ConfigBean;
import com.example.demo.config.ConfigCom;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TestController实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-01-07 14:10:14
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class TestController {

    @Resource
    private ConfigBean configBean;
    @Resource
    private ConfigCom configCom;

    @Value("${faker.name}")
    private String name;

    @Value("${faker.age}")
    private Integer age;

    @RequestMapping("/faker")
    public String faker() {
        return name + age;
    }

    @RequestMapping("/kobe")
    public String kobe() {
        return configBean.toString();
    }

    @RequestMapping("/com")
    public String com() {
        return configCom.getName() + configCom.getAge();
    }
}
