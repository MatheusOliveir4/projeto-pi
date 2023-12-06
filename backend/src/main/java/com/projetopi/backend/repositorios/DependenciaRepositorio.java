package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.Dependencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependenciaRepositorio extends JpaRepository<Dependencia, Integer> {
}
