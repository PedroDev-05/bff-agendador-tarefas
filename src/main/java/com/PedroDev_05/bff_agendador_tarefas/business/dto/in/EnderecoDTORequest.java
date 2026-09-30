package com.PedroDev_05.bff_agendador_tarefas.business.dto.in;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTORequest {


    private Long numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
}