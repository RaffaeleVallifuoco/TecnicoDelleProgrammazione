package access.data_access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import access.data_access.model.Prodotto;

@Repository
public interface ProdottoRepo extends JpaRepository<Prodotto, Long> {

}
