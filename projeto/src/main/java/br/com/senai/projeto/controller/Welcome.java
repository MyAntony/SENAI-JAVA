package br.com.senai.projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome
{
    @RequestMapping
    public String welcome()
    {
        return "Bem-vindo ao projeto!";
    }
}
