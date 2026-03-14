package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Facture;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}