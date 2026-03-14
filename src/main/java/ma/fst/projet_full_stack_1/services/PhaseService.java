package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Phase;
import ma.fst.projet_full_stack_1.repositories.PhaseRepository;
import ma.fst.projet_full_stack_1.exceptions.ResourceNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhaseService {

    private final PhaseRepository phaseRepository;

    public PhaseService(PhaseRepository phaseRepository) {
        this.phaseRepository = phaseRepository;
    }

    public Phase createPhase(Phase phase) {
        return phaseRepository.save(phase);
    }

    public List<Phase> getAllPhases() {
        return phaseRepository.findAll();
    }

    public Phase getPhaseById(Long id) {
        return phaseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Phase non trouvée"));
    }

    public Phase updatePhase(Long id, Phase phase) {

        Phase existing = getPhaseById(id);

        existing.setCode(phase.getCode());
        existing.setLibelle(phase.getLibelle());
        existing.setDescription(phase.getDescription());
        existing.setDateDebut(phase.getDateDebut());
        existing.setDateFin(phase.getDateFin());
        existing.setMontant(phase.getMontant());
        existing.setEtatRealisation(phase.isEtatRealisation());
        existing.setEtatFacturation(phase.isEtatFacturation());
        existing.setEtatPaiement(phase.isEtatPaiement());

        return phaseRepository.save(existing);
    }

    public void deletePhase(Long id) {

        Phase phase = getPhaseById(id);
        phaseRepository.delete(phase);
    }
}