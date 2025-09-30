package com.example.demoproj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(path = "/hello")
    @ResponseBody
    public String hello(){

        return "hello";
    }
}
