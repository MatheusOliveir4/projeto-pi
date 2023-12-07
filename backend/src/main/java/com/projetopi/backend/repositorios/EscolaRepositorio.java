package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepositorio extends JpaRepository<Escola, Integer> {


}
