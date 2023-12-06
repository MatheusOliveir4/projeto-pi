package com.projetopi.backend.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "salas")
public class Salas {

  @Id
  @EqualsAndHashCode.Include
  @Column(name = "co_entidade")
  private Integer id;
}
