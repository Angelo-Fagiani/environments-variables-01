package it.develhope.environmentsvariables01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {

    @Autowired
    Environment environment;

    @GetMapping(value = "/")
    public String getProperty(){
        String devName = environment.getProperty("myCustomVar.devName");
        String authCode = environment.getProperty("myCustomVar.authCode");
        return "Welcome " + devName + " " + authCode;
    }
}
