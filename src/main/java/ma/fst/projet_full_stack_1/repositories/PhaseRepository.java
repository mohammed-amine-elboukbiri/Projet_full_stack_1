package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Phase;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhaseRepository extends JpaRepository<Phase, Long> {

    List<Phase> findByEtatRealisationTrueAndEtatFacturationFalse();

    List<Phase> findByEtatFacturationTrueAndEtatPaiementFalse();

    List<Phase> findByEtatPaiementTrue();

}