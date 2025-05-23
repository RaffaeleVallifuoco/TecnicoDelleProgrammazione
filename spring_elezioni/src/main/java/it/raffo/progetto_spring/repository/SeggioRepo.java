package it.raffo.progetto_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import it.raffo.progetto_spring.model.Seggio;

@Repository
public interface SeggioRepo extends JpaRepository<Seggio, Integer> {

    List<Seggio> findByCode(Integer code);

    List<Seggio> findByCityContainingIgnoreCase(String city);

}
