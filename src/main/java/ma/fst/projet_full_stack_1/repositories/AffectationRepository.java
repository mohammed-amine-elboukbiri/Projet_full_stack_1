package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Affectation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AffectationRepository extends JpaRepository<Affectation, Long> {
}