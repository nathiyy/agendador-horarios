package com.projetojava.agendador_horarios.services;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.management.RuntimeErrorException;
import org.springframework.stereotype.Service;
import com.projetojava.agendador_horarios.infrastructure.entity.Agendamento;
import com.projetojava.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    public Agendamento salvarAgendamento(Agendamento agendamento){

        //usado para conseguir agendar pessoas com pelo menos uma hora após a outra
        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
        LocalDateTime horaFim = agendamento.getDataHoraAgendamento().plusHours(1);

        Agendamento agendados = agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(agendamento.getServico(),
        horaAgendamento,horaFim);

        if(!Objects.isNull(agendados)){
            throw new RuntimeException("Horário já está preenchido");
        }
        return agendamentoRepository.save(agendamento);
    }
        public void deletarAgendamento(LocalDateTime agendamentoDataHoraAgendamento, String cliente){
            agendamentoRepository.deleteByDataHoraAgendamentoAndCliente(agendamentoDataHoraAgendamento, cliente);
        }

        public Agendamento buscarAgendamentosDia(LocalDate data){
            LocalDateTime primeiraHoraDia = data.atStartOfDay();
            LocalDateTime horaFinalDia = data.atTime(23, 59, 59);

        return agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(null, primeiraHoraDia, horaFinalDia);

        }
        public Agendamento altearAgendamento(Agendamento agendamento, String cliente, LocalDateTime dataHoraAgendamento){
           Agendamento agenda = agendamentoRepository.findyByDataHoraAgendamentoAndCliente(dataHoraAgendamento, cliente);
        
        if(Objects.isNull(agenda)){
            throw new RuntimeException("Horário não está preenchido");
        }
        agendamento.setId(agenda.getId());
        return agendamentoRepository.save(agendamento);
    
    }
}