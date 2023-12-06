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
@Table(name = "recursosbasicos")
public class RecursosBasicos {

  @Id
  @EqualsAndHashCode.Include
  @Column(name = "co_entidade")
  private Integer id;

  @Column(name = "in_agua_potavel")
  private Integer temAguaPotavel;

  @Column(name = "in_agua_inexistente")
  private Integer temAguaInexistente;

  @Column(name = "in_energia_rede_publica")
  private Integer temEnergiaRedePublica;
}
