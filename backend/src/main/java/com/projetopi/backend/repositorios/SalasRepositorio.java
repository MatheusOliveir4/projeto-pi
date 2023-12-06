package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.Matricula;
import com.projetopi.backend.entidades.Salas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalasRepositorio extends JpaRepository<Salas, Integer> {
}
