package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Projet;
import ma.fst.projet_full_stack_1.repositories.ProjetRepository;
import ma.fst.projet_full_stack_1.exceptions.ResourceNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetService {

    private final ProjetRepository projetRepository;

    public ProjetService(ProjetRepository projetRepository) {
        this.projetRepository = projetRepository;
    }

    public Projet createProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    public Projet getProjetById(Long id) {
        return projetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Projet non trouvé"));
    }

    public Projet updateProjet(Long id, Projet projet) {

        Projet existing = getProjetById(id);

        existing.setCode(projet.getCode());
        existing.setNom(projet.getNom());
        existing.setDescription(projet.getDescription());
        existing.setDateDebut(projet.getDateDebut());
        existing.setDateFin(projet.getDateFin());
        existing.setMontant(projet.getMontant());

        return projetRepository.save(existing);
    }

    public void deleteProjet(Long id) {

        Projet projet = getProjetById(id);
        projetRepository.delete(projet);
    }
}