package ma.fst.projet_full_stack_1.reporting;

import ma.fst.projet_full_stack_1.entities.Phase;
import ma.fst.projet_full_stack_1.entities.Projet;
import ma.fst.projet_full_stack_1.repositories.PhaseRepository;
import ma.fst.projet_full_stack_1.repositories.ProjetRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reporting")
public class ReportingController {

    private final PhaseRepository phaseRepository;
    private final ProjetRepository projetRepository;

    public ReportingController(
            PhaseRepository phaseRepository,
            ProjetRepository projetRepository) {

        this.phaseRepository = phaseRepository;
        this.projetRepository = projetRepository;
    }


    @GetMapping("/phases/terminees-non-facturees")
    public List<Phase> getPhasesTermineesNonFacturees() {

        return phaseRepository
                .findByEtatRealisationTrueAndEtatFacturationFalse();
    }


    @GetMapping("/phases/facturees-non-payees")
    public List<Phase> getPhasesFactureesNonPayees() {

        return phaseRepository
                .findByEtatFacturationTrueAndEtatPaiementFalse();
    }


    @GetMapping("/phases/payees")
    public List<Phase> getPhasesPayees() {

        return phaseRepository
                .findByEtatPaiementTrue();
    }


    @GetMapping("/projets/en-cours")
    public List<Projet> getProjetsEnCours() {

        return projetRepository
                .findByDateFinIsNull();
    }


    @GetMapping("/projets/clotures")
    public List<Projet> getProjetsClotures() {

        return projetRepository
                .findByDateFinIsNotNull();
    }

}
