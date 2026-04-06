package com.projetojava.agendador_horarios.infrastructure.repository;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projetojava.agendador_horarios.infrastructure.entity.Agendamento;
import jakarta.transaction.Transactional;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    Agendamento findByServicoAndDataHoraAgendamentoBetween(
        String servico,
        LocalDateTime dataHoraInicio,
        LocalDateTime dataFinal);

    @Transactional
        Void deleteByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);

        Agendamento findByDataHoraAgendamentoBetween(LocalDateTime dataHoraInicial, LocalDateTime dataHoraFinal);

        Agendamento findByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);
    }
    

