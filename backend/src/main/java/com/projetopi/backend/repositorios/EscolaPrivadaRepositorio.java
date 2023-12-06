package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.Dependencia;
import com.projetopi.backend.entidades.EscolaPrivada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaPrivadaRepositorio extends JpaRepository<EscolaPrivada, Integer> {
}
