package com.projetopi.backend.recursos;

import com.projetopi.backend.dtos.LixoEsgotoDTO;
import com.projetopi.backend.entidades.LixoEsgoto;
import com.projetopi.backend.entidades.Matricula;
import com.projetopi.backend.repositorios.EscolaPublicaRepositorio;
import com.projetopi.backend.repositorios.LixoEsgotoRepositorio;
import com.projetopi.backend.repositorios.MatriculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lixo_esgoto")
public class LixoEsgotoRecurso {

  @Autowired
  private LixoEsgotoRepositorio repositorio;

  @GetMapping
  public ResponseEntity<Page<LixoEsgotoDTO>> listar(Pageable pageable) {
    Page<LixoEsgoto> resultado = repositorio.findAll(pageable);
    return ResponseEntity.ok(resultado.map(entity -> new LixoEsgotoDTO(entity)));
  }
}
