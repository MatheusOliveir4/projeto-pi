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
  private Integer id;

  @OneToOne
  @MapsId
  @JoinColumn(name = "co_entidade")
  private Escola escola;

  @Embedded
  private Endereco endereco;
}
