package com.projetopi.backend.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "escolapublica")
public class EscolaPublica {

  @Id
  @EqualsAndHashCode.Include
  @Column(name = "co_entidade")
  private Integer id;

  @Embedded
  private Endereco endereco;
}
