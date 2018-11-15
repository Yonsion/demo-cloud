package com.yonsion.demo.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    RestTemplate restTemplate;

    @RequestMapping("test")
    public String test() {
        ResponseEntity<String> entity = restTemplate.getForEntity("http://PROVIDER/test", String.class);

        return entity.getBody();
    }
}
