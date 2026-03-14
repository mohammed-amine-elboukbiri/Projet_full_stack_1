package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Affectation;
import ma.fst.projet_full_stack_1.repositories.AffectationRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AffectationService {

    private final AffectationRepository affectationRepository;

    public AffectationService(AffectationRepository affectationRepository) {
        this.affectationRepository = affectationRepository;
    }

    public Affectation createAffectation(Affectation affectation) {
        return affectationRepository.save(affectation);
    }

    public List<Affectation> getAllAffectations() {
        return affectationRepository.findAll();
    }
}