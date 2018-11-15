package com.yonsion.demo.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yonsion
 * @version v1.0
 * @description
 * @date 2018 - 11 - 15
 */
@FeignClient("PROVIDER")
public interface Test {

    @GetMapping("/test")
    public String test();
}
