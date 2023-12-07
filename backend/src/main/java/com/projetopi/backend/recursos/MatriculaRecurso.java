package com.projetopi.backend.recursos;

import com.projetopi.backend.dtos.LixoEsgotoDTO;
import com.projetopi.backend.dtos.MatriculaDTO;
import com.projetopi.backend.entidades.LixoEsgoto;
import com.projetopi.backend.entidades.Matricula;
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
@RequestMapping("/matriculas")
public class MatriculaRecurso {

  @Autowired
  private MatriculaRepositorio repositorio;

  @GetMapping
  public ResponseEntity<List<MatriculaDTO>> listar() {
    List<Matricula> resultado = repositorio.findAll();
    return ResponseEntity.ok(resultado.stream().map(entity -> new MatriculaDTO(entity)).toList());
  }
}
