package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.RecursosBasicos;
import com.projetopi.backend.entidades.TI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursosBasicosRepositorio extends JpaRepository<RecursosBasicos, Integer> {
}
