package com.example.designpatterns.controller;

import com.example.designpatterns.singleton.SingletonExamplesRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patterns")
public class PatternTestController {

    @RequestMapping("/singleton")
    public String testSingletons(){
        return new SingletonExamplesRunner().run();
    }

}