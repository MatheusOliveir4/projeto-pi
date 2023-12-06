package com.projetopi.backend.dtos;

import com.projetopi.backend.entidades.LixoEsgoto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LixoEsgotoDTO {

  private Integer id;
  private Integer temTratamentoLixoSeparacao;

  public LixoEsgotoDTO(LixoEsgoto entity) {
    this.id = entity.getId();
    this.temTratamentoLixoSeparacao = entity.getTemTratamentoLixoSeparacao();
  }
}
