package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Organisme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganismeRepository extends JpaRepository<Organisme, Long> {
}