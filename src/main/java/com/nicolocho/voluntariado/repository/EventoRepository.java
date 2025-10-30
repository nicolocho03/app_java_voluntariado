package com.nicolocho.voluntariado.repository;

import com.nicolocho.voluntariado.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
