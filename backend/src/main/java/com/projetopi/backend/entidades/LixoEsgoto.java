package com.projetopi.backend.entidades;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "lixoesgoto")
public class LixoEsgoto {

  @Id
  @EqualsAndHashCode.Include
  private Integer id;

  @OneToOne
  @MapsId
  @JoinColumn(name = "co_entidade")
  private Escola escola;

  @Column(name = "in_tratamento_lixo_separacao")
  private Integer temTratamentoLixoSeparacao;
}
