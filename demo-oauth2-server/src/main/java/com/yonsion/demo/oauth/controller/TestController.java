package com.yonsion.demo.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Yonsion
 * @date: 2018 - 12 - 21
 * @version: v1.0
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "oauth2 server test!!!!!";
    }
}
