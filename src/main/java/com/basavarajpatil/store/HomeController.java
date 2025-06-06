package com.basavarajpatil.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${spring.application.name}")
    private String AppName;

    @RequestMapping("/")
    public String index(){
        String viewName = getViewName();

        System.out.println("appName: " + AppName);
        return  viewName;
    }

    private String getViewName(){
        return "index.html";
    }
}
