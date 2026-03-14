package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
    Optional<Employe> findByLogin(String login);
}