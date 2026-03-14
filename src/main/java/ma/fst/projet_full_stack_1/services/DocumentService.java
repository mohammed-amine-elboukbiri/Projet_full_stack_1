package ma.fst.projet_full_stack_1.services;

import ma.fst.projet_full_stack_1.entities.Document;
import ma.fst.projet_full_stack_1.repositories.DocumentRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Document createDocument(Document document) {
        return documentRepository.save(document);
    }

    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
}