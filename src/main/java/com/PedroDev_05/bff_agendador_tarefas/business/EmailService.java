package com.PedroDev_05.bff_agendador_tarefas.business;

import com.PedroDev_05.bff_agendador_tarefas.business.dto.out.TarefasDTOResponse;
import com.PedroDev_05.bff_agendador_tarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto) {
        emailClient.enviarEmail(dto);
    }
}