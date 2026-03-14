package ma.fst.projet_full_stack_1.mappers;

import ma.fst.projet_full_stack_1.entities.Projet;
import ma.fst.projet_full_stack_1.dto.ProjetDTO;

public class ProjetMapper {

    public static ProjetDTO toDTO(Projet projet) {

        ProjetDTO dto = new ProjetDTO();

        dto.setId(projet.getId());
        dto.setCode(projet.getCode());
        dto.setNom(projet.getNom());
        dto.setDescription(projet.getDescription());
        dto.setDateDebut(projet.getDateDebut());
        dto.setDateFin(projet.getDateFin());
        dto.setMontant(projet.getMontant());

        return dto;
    }

    public static Projet toEntity(ProjetDTO dto) {

        Projet projet = new Projet();

        projet.setId(dto.getId());
        projet.setCode(dto.getCode());
        projet.setNom(dto.getNom());
        projet.setDescription(dto.getDescription());
        projet.setDateDebut(dto.getDateDebut());
        projet.setDateFin(dto.getDateFin());
        projet.setMontant(dto.getMontant());

        return projet;
    }
}