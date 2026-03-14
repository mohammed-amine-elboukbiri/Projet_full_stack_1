package ma.fst.projet_full_stack_1.mappers;

import ma.fst.projet_full_stack_1.entities.Facture;
import ma.fst.projet_full_stack_1.dto.FactureDTO;

public class FactureMapper {

    public static FactureDTO toDTO(Facture facture) {

        FactureDTO dto = new FactureDTO();

        dto.setId(facture.getId());
        dto.setCode(facture.getCode());
        dto.setDateFacture(facture.getDateFacture());

        return dto;
    }

    public static Facture toEntity(FactureDTO dto) {

        Facture facture = new Facture();

        facture.setId(dto.getId());
        facture.setCode(dto.getCode());
        facture.setDateFacture(dto.getDateFacture());

        return facture;
    }
}
