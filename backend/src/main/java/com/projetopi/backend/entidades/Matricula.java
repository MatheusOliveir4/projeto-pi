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
@Table(name = "matricula")
public class Matricula {

  @Id
  @EqualsAndHashCode.Include
  @Column(name = "co_entidade")
  private Integer id;

  @Column(name = "qt_mat_bas", nullable = false)
  private Integer qtMatriculaBasica;

  @Column(name = "qt_mat_inf", nullable = false)
  private Integer qtMatriculaInfantil;

  @Column(name = "qt_mat_inf_cre", nullable = false)
  private Integer qtMatriculaInfantilCreche;

  @Column(name = "qt_mat_inf_pre", nullable = false)
  private Integer qtMatriculaInfantilPre;

  @Column(name = "qt_mat_fund", nullable = false)
  private Integer qtMatriculaFundamental;

}
