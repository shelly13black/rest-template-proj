package com.example.resttemplate.controller;

import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "rest", tags = {"Rest_Template"})
public class MainController {

    @PostMapping("/test")
    public ResponseEntity<String> test(@RequestParam String parameter){
        return new ResponseEntity<>("Made it to rest project! - " + parameter, HttpStatus.OK);
    }
}
