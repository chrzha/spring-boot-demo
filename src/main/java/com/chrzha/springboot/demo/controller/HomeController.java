package com.chrzha.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by chrzha on 17-2-27.
 */

@Controller
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/")
    String home(Map<String, Object> model) {
        List<String> users = Arrays.asList("a","b","c","d");
        model.put("users",users);
        return "index";
    }
}