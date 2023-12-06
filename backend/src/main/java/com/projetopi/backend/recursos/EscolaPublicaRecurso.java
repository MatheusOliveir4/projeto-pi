package com.projetopi.backend.recursos;

import com.projetopi.backend.entidades.Dependencia;
import com.projetopi.backend.entidades.EscolaPublica;
import com.projetopi.backend.repositorios.DependenciaRepositorio;
import com.projetopi.backend.repositorios.EscolaPublicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/escolas_publicas")
public class EscolaPublicaRecurso {

  @Autowired
  private EscolaPublicaRepositorio repositorio;

  @Autowired
  private DependenciaRepositorio dependenciaRepositorio;

  @GetMapping
  public ResponseEntity<List<Dependencia>> listar() {
    List<Dependencia> resultado = dependenciaRepositorio.findAll();
    return ResponseEntity.ok(resultado);
  }
}
