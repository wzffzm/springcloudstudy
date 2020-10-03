package com.wzffzm.controller;

import com.wzffzm.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class StudentHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }
}
