package com.example.designpatterns.controller;

import com.example.designpatterns.singleton_logger.LogLevel;
import com.example.designpatterns.singleton_logger.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Log")
public class LogController {

    @PostMapping("/log_singleton")
    public String log(@RequestParam LogLevel level, @RequestParam String message){
        Logger.INSTANCE.log(level, message);
        return "Logged" + level + "," + message ;
    }

}