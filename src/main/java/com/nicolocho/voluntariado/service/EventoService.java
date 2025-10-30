package com.nicolocho.voluntariado.service;

import com.nicolocho.voluntariado.model.Evento;
import com.nicolocho.voluntariado.repository.EventoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> listarEventos() {
        return eventoRepository.findAll();
    }

    public Evento crearEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public Optional<Evento> buscarEventoPorId(Long id) {
        return eventoRepository.findById(id);
    }
}
