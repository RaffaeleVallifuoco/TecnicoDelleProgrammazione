package access.data_access.service;

import java.util.List;

import access.data_access.model.Prodotto;

public interface ProdottoService {

    List<Prodotto> getAllProdotti();

    void saveProdotto(Prodotto prodotto);

    Prodotto getProdottoById(Long id);

    void deleteProdottoById(Long id);

}
