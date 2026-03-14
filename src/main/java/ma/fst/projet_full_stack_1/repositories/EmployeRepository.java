package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Employe;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

    Optional<Employe> findByLogin(String login);

}