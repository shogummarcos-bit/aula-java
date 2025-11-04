package com.exatividade.springboot.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class ExController {
    @GetMapping("/api")
    public String home(){
        return "ola mundo";
    }
    @GetMapping("/api/test/{numeroUm}/{numeridois}")
    public int teste(@PathVariable int numeroUm,@PathVariable int numeridois){
        return numeroUm+numeridois;
    }
    
}
