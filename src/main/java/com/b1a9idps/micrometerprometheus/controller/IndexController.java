package com.b1a9idps.micrometerprometheus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.micrometerprometheus.response.IndexResponse;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public IndexResponse index() {
        return new IndexResponse("Hello World!!");
    }

}
