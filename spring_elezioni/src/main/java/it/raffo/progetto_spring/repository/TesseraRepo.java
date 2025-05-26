package it.raffo.progetto_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.raffo.progetto_spring.model.TesseraElettorale;

@Repository
public interface TesseraRepo extends JpaRepository<TesseraElettorale, Integer> {

    List<TesseraElettorale> findByCodeContainingIgnoreCase(String code);

    List<TesseraElettorale> findByPersona_NameContainingIgnoreCase(String name);

}
