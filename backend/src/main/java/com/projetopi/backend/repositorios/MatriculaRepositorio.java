package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.Funcionarios;
import com.projetopi.backend.entidades.Matricula;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepositorio extends JpaRepository<Matricula, Integer> {
}
