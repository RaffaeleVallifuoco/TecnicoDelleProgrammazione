package it.raffo.progetto_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.raffo.progetto_spring.model.Autore;

public interface AutoreRepo extends JpaRepository<Autore, Integer> {

    Autore findByNome(String nome);

}
