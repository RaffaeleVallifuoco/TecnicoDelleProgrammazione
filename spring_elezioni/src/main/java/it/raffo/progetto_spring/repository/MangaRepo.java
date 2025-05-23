package it.raffo.progetto_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.raffo.progetto_spring.model.Manga;

public interface MangaRepo extends JpaRepository<Manga, Integer> {

    Manga findByTitolo(String titolo);

    List<Manga> findAllByIdFumetteria(Integer idFumetteria);
}
