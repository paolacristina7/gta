package com.seduc2.gtaa.Service;

import com.seduc2.gtaa.entity.personagem;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.seduc2.gtaa.repositories.Personagemrepository;

import java.util.List;

@Service
public class personagemService {

    private final Personagemrepository repository;

    public personagemService(Personagemrepository repository) {
        this.repository = repository;
    }

    public List<personagem> mostrarPersonagem() {
        return repository.findAll();
    }

    public void cadastrarpersonagem(personagem p) {
        repository.save(p);
    }

    public void deletar(long id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(long id, personagem p){
    personagem personagem = repository.getReferenceById(id);
    personagem.setNome(p.getNome());
    personagem.setApelido(p.getApelido());
    personagem.setCategoria(p.getCategoria());
    personagem.setDescricao(p.getDescricao());
    }
}

