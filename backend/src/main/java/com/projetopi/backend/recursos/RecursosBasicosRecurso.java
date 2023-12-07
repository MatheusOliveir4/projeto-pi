package com.projetopi.backend.recursos;

import com.projetopi.backend.dtos.TIDTO;
import com.projetopi.backend.entidades.TI;
import com.projetopi.backend.repositorios.TIRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ti")
public class RecursosBasicosRecurso {

  @Autowired
  private Recursos repositorio;

  @GetMapping
  public ResponseEntity<List<TIDTO>> listar() {
    List<TI> resultado = repositorio.findAll();
    return ResponseEntity.ok(resultado.stream().map(entity -> new TIDTO(entity)).toList());
  }

  @GetMapping("{id}")
  public ResponseEntity<TIDTO> encontrarRegistro(@PathVariable int id) {
    Optional<TI> resultado = repositorio.findById(id);
    TI entity =  resultado.orElseThrow(() -> new RuntimeException("Não foi encontrado o recurso"));

    return ResponseEntity.ok(new TIDTO(entity));
  }
}
