package com.boot.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServiceImpl {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
