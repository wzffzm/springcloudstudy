package com.wzffzm.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wzffzm.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;


    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
