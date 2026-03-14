package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Organisme;
import ma.fst.projet_full_stack_1.repositories.OrganismeRepository;
import ma.fst.projet_full_stack_1.exceptions.ResourceNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganismeService {

    private final OrganismeRepository organismeRepository;

    public OrganismeService(OrganismeRepository organismeRepository) {
        this.organismeRepository = organismeRepository;
    }

    public Organisme createOrganisme(Organisme organisme) {
        return organismeRepository.save(organisme);
    }

    public List<Organisme> getAllOrganismes() {
        return organismeRepository.findAll();
    }

    public Organisme getOrganismeById(Long id) {
        return organismeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Organisme non trouvé"));
    }

    public Organisme updateOrganisme(Long id, Organisme organisme) {

        Organisme existing = getOrganismeById(id);

        existing.setCode(organisme.getCode());
        existing.setNom(organisme.getNom());
        existing.setAdresse(organisme.getAdresse());
        existing.setTelephone(organisme.getTelephone());
        existing.setNomContact(organisme.getNomContact());
        existing.setEmailContact(organisme.getEmailContact());
        existing.setSiteWeb(organisme.getSiteWeb());

        return organismeRepository.save(existing);
    }

    public void deleteOrganisme(Long id) {

        Organisme organisme = getOrganismeById(id);
        organismeRepository.delete(organisme);
    }
}