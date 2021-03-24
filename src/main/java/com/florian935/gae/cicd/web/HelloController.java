package com.florian935.gae.cicd.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String greeting() {
        return "Hello World !";
    }
}
