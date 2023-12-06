package com.projetopi.backend.repositorios;

import com.projetopi.backend.entidades.LixoEsgoto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LixoEsgotoRepositorio extends JpaRepository<LixoEsgoto, Integer> {

  @Query("select obj.id, obj.temTratamentoLixoSeparacao from LixoEsgoto obj")
  public Page<LixoEsgoto> searchAll(Pageable pageable);
}
