package it.raffo.progetto_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.raffo.progetto_spring.model.Persona;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Integer> {

    List<Persona> findByNameContainingIgnoreCase(String name);

}
