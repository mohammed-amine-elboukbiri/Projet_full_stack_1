package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Facture;
import ma.fst.projet_full_stack_1.repositories.FactureRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureService {

    private final FactureRepository factureRepository;

    public FactureService(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    public Facture createFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }
}