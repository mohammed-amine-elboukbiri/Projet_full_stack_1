package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Livrable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrableRepository extends JpaRepository<Livrable, Long> {
}