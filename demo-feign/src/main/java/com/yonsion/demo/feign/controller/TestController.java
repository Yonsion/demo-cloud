package com.yonsion.demo.feign.controller;

import com.yonsion.demo.feign.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yonsion
 * @version v1.0
 * @description
 * @date 2018 - 11 - 15
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    Test test;

    @RequestMapping("test")
    public String test(){
        return test.test();
    }
}
