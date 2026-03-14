package ma.fst.projet_full_stack_1.mappers;

import ma.fst.projet_full_stack_1.entities.Organisme;
import ma.fst.projet_full_stack_1.dto.OrganismeDTO;

public class OrganismeMapper {

    public static OrganismeDTO toDTO(Organisme organisme) {

        OrganismeDTO dto = new OrganismeDTO();

        dto.setId(organisme.getId());
        dto.setCode(organisme.getCode());
        dto.setNom(organisme.getNom());
        dto.setAdresse(organisme.getAdresse());
        dto.setTelephone(organisme.getTelephone());
        dto.setNomContact(organisme.getNomContact());
        dto.setEmailContact(organisme.getEmailContact());
        dto.setSiteWeb(organisme.getSiteWeb());

        return dto;
    }

    public static Organisme toEntity(OrganismeDTO dto) {

        Organisme organisme = new Organisme();

        organisme.setId(dto.getId());
        organisme.setCode(dto.getCode());
        organisme.setNom(dto.getNom());
        organisme.setAdresse(dto.getAdresse());
        organisme.setTelephone(dto.getTelephone());
        organisme.setNomContact(dto.getNomContact());
        organisme.setEmailContact(dto.getEmailContact());
        organisme.setSiteWeb(dto.getSiteWeb());

        return organisme;
    }
}