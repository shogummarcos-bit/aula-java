package com.exatividade.springboot.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/")
public class ExController {
    @GetMapping("/api")
    public String home(){
        return "ola mundo";
    }
}
