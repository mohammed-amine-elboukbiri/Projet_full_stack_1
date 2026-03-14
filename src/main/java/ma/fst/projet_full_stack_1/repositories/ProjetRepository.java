package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Projet;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

    List<Projet> findByDateFinIsNull();

    List<Projet> findByDateFinIsNotNull();

}