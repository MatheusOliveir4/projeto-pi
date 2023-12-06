package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.EscolaPublica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaPublicaRepositorio extends JpaRepository<EscolaPublica, Integer> {
}
