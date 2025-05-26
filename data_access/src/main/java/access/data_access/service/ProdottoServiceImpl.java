package access.data_access.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import access.data_access.model.Prodotto;
import access.data_access.repository.ProdottoRepo;

// classe intermedia con metodi di utilità

@Service
public class ProdottoServiceImpl implements ProdottoService {

    ProdottoRepo prodottoRepo;

    public ProdottoServiceImpl(ProdottoRepo prodottoRepo) {
        this.prodottoRepo = prodottoRepo;
    }

    @Override
    public List<Prodotto> getAllProdotti() {
        return prodottoRepo.findAll();

    }

    @Override
    public void saveProdotto(Prodotto prodotto) {
        prodottoRepo.save(prodotto);

    }

    @Override
    public Prodotto getProdottoById(Long id) {
        Optional<Prodotto> optionalProdotto = prodottoRepo.findById(id);
        Prodotto prodotto = null;

        if (optionalProdotto.isPresent()) {
            prodotto = optionalProdotto.get();
        } else {
            throw new RuntimeException("Il prodotto con id " + id + " non è stato trovato");
        }

        return prodotto;

    }

    @Override
    public void deleteProdottoById(Long id) {
        prodottoRepo.deleteById(id);

    }

}
