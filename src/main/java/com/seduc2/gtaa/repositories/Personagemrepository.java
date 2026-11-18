package com.seduc2.gtaa.repositories;

import com.seduc2.gtaa.entity.personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Personagemrepository extends JpaRepository<personagem,Long> {

}
