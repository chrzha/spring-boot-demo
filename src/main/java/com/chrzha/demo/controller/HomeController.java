package com.chrzha.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chrzha on 17-2-27.
 */

@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}