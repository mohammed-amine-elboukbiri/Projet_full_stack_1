package ma.fst.projet_full_stack_1.repositories;

import ma.fst.projet_full_stack_1.entities.Document;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}