package com.chrzha.springboot.demo.controller;

import com.chrzha.springboot.demo.model.Visitor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris.Zhang on 4/9/2017.
 */
@Controller
@RequestMapping("/v1")
public class VisitorController {

    @RequestMapping(value = "/visitors", method = RequestMethod.GET)
    @ResponseBody
    public List<Visitor> getAllVisitors() {
        List<Visitor> visitors = new ArrayList<Visitor>();
        Visitor v = new Visitor();
        v.setBrowser("Chrome");
        v.setPlatform("Windows");
        v.setIp("192.168.179.32");
        visitors.add(v);
        return visitors;
    }
}
