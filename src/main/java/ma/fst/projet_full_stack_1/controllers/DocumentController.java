package ma.fst.projet_full_stack_1.controllers;

import ma.fst.projet_full_stack_1.entities.Document;
import ma.fst.projet_full_stack_1.services.DocumentService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public Document create(@RequestBody Document document) {
        return documentService.createDocument(document);
    }

    @GetMapping
    public List<Document> getAll() {
        return documentService.getAllDocuments();
    }
}