package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleController {

    private static final String message = "Hello World";

    @GetMapping("/sample")
    public ResponseEntity<String> sample() {
        return new ResponseEntity(message, HttpStatus.OK);
    }

}
