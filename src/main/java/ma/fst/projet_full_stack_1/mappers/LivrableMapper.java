package ma.fst.projet_full_stack_1.mappers;

import ma.fst.projet_full_stack_1.entities.Livrable;
import ma.fst.projet_full_stack_1.dto.LivrableDTO;

public class LivrableMapper {

    public static LivrableDTO toDTO(Livrable livrable) {

        LivrableDTO dto = new LivrableDTO();

        dto.setId(livrable.getId());
        dto.setCode(livrable.getCode());
        dto.setLibelle(livrable.getLibelle());
        dto.setDescription(livrable.getDescription());
        dto.setChemin(livrable.getChemin());

        return dto;
    }

    public static Livrable toEntity(LivrableDTO dto) {

        Livrable livrable = new Livrable();

        livrable.setId(dto.getId());
        livrable.setCode(dto.getCode());
        livrable.setLibelle(dto.getLibelle());
        livrable.setDescription(dto.getDescription());
        livrable.setChemin(dto.getChemin());

        return livrable;
    }
}
