package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Livrable;
import ma.fst.projet_full_stack_1.repositories.LivrableRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrableService {

    private final LivrableRepository livrableRepository;

    public LivrableService(LivrableRepository livrableRepository) {
        this.livrableRepository = livrableRepository;
    }

    public Livrable createLivrable(Livrable livrable) {
        return livrableRepository.save(livrable);
    }

    public List<Livrable> getAllLivrables() {
        return livrableRepository.findAll();
    }
}