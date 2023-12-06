package com.projetopi.backend.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "escolaprivada")
public class EscolaPrivada {

  @Id
  @EqualsAndHashCode.Include
//  @OneToOne
//  @JoinColumn(name = "co_entidade")
  private Integer id;

  @Embedded
  private Endereco endereco;
}
