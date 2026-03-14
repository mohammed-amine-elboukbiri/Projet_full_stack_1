package ma.fst.projet_full_stack_1.mappers;

import ma.fst.projet_full_stack_1.entities.Document;
import ma.fst.projet_full_stack_1.dto.DocumentDTO;

public class DocumentMapper {

    public static DocumentDTO toDTO(Document document) {

        DocumentDTO dto = new DocumentDTO();

        dto.setId(document.getId());
        dto.setCode(document.getCode());
        dto.setLibelle(document.getLibelle());
        dto.setDescription(document.getDescription());
        dto.setChemin(document.getChemin());

        return dto;
    }

    public static Document toEntity(DocumentDTO dto) {

        Document document = new Document();

        document.setId(dto.getId());
        document.setCode(dto.getCode());
        document.setLibelle(dto.getLibelle());
        document.setDescription(dto.getDescription());
        document.setChemin(dto.getChemin());

        return document;
    }
}