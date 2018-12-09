package com.yonsion.demo.profile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Yonsion
 * @date: 2018 - 12 - 09
 * @version: v1.0
 */

//@ConfigurationProperties(prefix = "yonsion")
@Configuration
public class TestConfig {

    @Value("${yonsion.local}")
    private String local;

    @Value("${yonsion.dev}")
    private String dev;

    @Value("${yonsion.test}")
    private String test;

    @Value("${yonsion.prod}")
    private String prod;

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }
}
