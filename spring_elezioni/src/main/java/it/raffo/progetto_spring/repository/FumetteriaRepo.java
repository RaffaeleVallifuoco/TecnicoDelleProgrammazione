package it.raffo.progetto_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.raffo.progetto_spring.model.Fumetteria;

public interface FumetteriaRepo extends JpaRepository<Fumetteria, Integer> {

    Fumetteria findByNome(String nome);

}
