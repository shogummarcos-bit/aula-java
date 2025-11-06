package com.atividadejava.demo.controller;

import com.projetojava.springstart.cliente.Cliente;
import com.projetojava.springstart.produto.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class ApiController{
    @GetMapping
    public Map<String,Object>resposta=new HashMap<>();
    resposta.put("mensagem","bem vindo Api");
    resposta.put("versao","1.0.0");
}
