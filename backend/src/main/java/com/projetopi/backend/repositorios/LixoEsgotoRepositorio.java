package com.projetopi.backend.repositorios;

import com.projetopi.backend.dtos.LixoEsgotoDTO;
import com.projetopi.backend.entidades.LixoEsgoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LixoEsgotoRepositorio extends JpaRepository<LixoEsgoto, Integer> {

}
