package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.EscolaPublica;
import com.projetopi.backend.entidades.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepositorio extends JpaRepository<Funcionarios, Integer> {
}
