package it.raffo.progetto_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thymeleaf.expression.Lists;

import it.raffo.progetto_spring.model.Libro;

public interface LibroRepo extends JpaRepository<Libro, Integer> {

    Libro findByTitolo(String titolo);

    List<Libro> findAllByIdAutore(Integer idAutore);
}
