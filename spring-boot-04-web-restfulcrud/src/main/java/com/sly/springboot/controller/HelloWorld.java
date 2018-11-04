package com.sly.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class HelloWorld {

//    @GetMapping({"/","/index.html"})
//    public String index(){
//        return "index";
//    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String a){
        return "hello";
    }



    @GetMapping("/success")
    public String success(HashMap<String, Object> map){
        map.put("hello","你好上海");
        return "success";
    }


}
