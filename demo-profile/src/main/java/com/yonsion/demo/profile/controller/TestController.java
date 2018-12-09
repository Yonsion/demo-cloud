package com.yonsion.demo.profile.controller;

import com.yonsion.demo.profile.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Yonsion
 * @date: 2018 - 12 - 09
 * @version: v1.0
 */
@RestController
public class TestController {
    @Autowired
    TestConfig config;

    @GetMapping("/test")
    public String test(){
        return config.getLocal() + "/" + config.getDev() + "/" + config.getTest() + "/" + config.getProd();
    }
}
