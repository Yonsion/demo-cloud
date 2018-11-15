package com.yonsion.demo.provider.controller;

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

    @RequestMapping("test")
    public String test(){
        return "test by port 10071";
    }
}
