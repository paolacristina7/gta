package com.seduc2.gtaa.controllers;

import com.seduc2.gtaa.Service.personagemService;
import com.seduc2.gtaa.entity.personagem;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("api/personagens")
@RestController
public class personagemcontroller {

    private final personagemService service;

    public personagemcontroller(personagemService service){
        this.service=service;
    }

    @GetMapping
    public List<personagem> mostrar(){
        return service.mostrarPersonagem();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id){
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable long id, @RequestBody personagem p){
        service.alterar(id,p);
    }

    @PostMapping
    public void Criarpersonagem(@RequestBody personagem p){
        service.cadastrarpersonagem(p);
    }
}
